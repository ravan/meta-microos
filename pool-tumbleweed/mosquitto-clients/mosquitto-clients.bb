SUMMARY = "Client for Mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
This makes it suitable for 'machine to machine' messaging such as with low \
power sensors or mobile devices such as phones, embedded computers or \
microcontrollers like the Arduino. A good example of this is all of the work \
that Andy Stanford-Clark (one of the originators of MQTT) has done in home \
monitoring and automation with his twittering house and twittering ferry. \
 \
Client for Mosquitto."
LICENSE = "EPL-1.0"

PV = "2.0.23"

RPM_NAME = "mosquitto-clients-2.0.23-1.4.aarch64.rpm"
RPM_HASH = "6099e804bfe5893fd5aac079af114997f3c80b3a4432b65df37aa6dcfd7e7c062937e9f36f5afba50e5566d88741c9230f47868b10c28c9b1fd27838aed853c5"

RPROVIDES:${PN} += "mosquitto-clients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libmosquitto.so.1"

inherit rpm
