#!/bin/sh

###################################
# simple gstreamer 1.0 dvb helper #
###################################

command=$1
option=$2

channels_conf="/home/root/dvb/channels.conf"
option_def1="/usr/share/dvb/dvb-t/de-Berlin"
option_def2="Das Erste"


if [ -z $command ]; then
        echo "usage: $0 command <option>"
        echo ""
        echo "command can be:"
        echo "-s <scan_list>    : scan dvb-channels, defaults to $option_def1"
        echo "-z <channel>      : zap to channel"
        echo "-l                : list channels"
else

        if [ $command == "-z" ]; then
                [ -z $option ] && option=$option_def2
                GST_DEBUG=3 \
                GST_DVB_CHANNELS_CONF=$channels_conf \
		gst-launch-1.0 -q playbin uri="dvb://$option"

                # gst-launch-0.10 -q playbin2 uri="dvb://$option"
                #or
                # gst-launch-1.0 -q playbin uri="dvb://$option"
        fi

        if [ $command == "-s" ]; then
                [ -z $option ] && option=$option_def1
                scan $option > $channels_conf
        fi

        if [ $command == "-l" ]; then
                echo "channels ($channels_conf) :"             
                sed -e 's/:.*//' $channels_conf | sort -u     
        fi
fi