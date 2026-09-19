SUMMARY = "A MQTT v3.1/v3.1.1 Broker"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
This makes it suitable for 'machine to machine' messaging such as with low \
power sensors or mobile devices such as phones, embedded computers or \
microcontrollers like the Arduino. A good example of this is all of the work \
that Andy Stanford-Clark (one of the originators of MQTT) has done in home \
monitoring and automation with his twittering house and twittering ferry."
LICENSE = "EPL-1.0"

PV = "2.0.23"

RPM_NAME = "mosquitto-2.0.23-1.4.aarch64.rpm"
RPM_HASH = "bc2acf12c70517daa2d090d063ea701cc0fd0d79b961d4e0ce2ac2495241d6128b70cb41c0756c0d789624c19b3b0fc10d1eb0604408faf9a372d45e8632c1d5"

RPROVIDES:${PN} += "config-mosquitto \
group-mosquitto \
mosquitto \
user-mosquitto"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libcrypto.so.3 \
libm.so.6 \
libmosquitto.so.1 \
libssl.so.3 \
libwebsockets.so.21 \
libwrap.so.0 \
sysuser-shadow"

inherit rpm
