SUMMARY = "Application binaries for aws-c-mqtt library"
DESCRIPTION = "AWS C99 implementation of the MQTT 3.1.1 specification. \
 \
This package contains the application binaries."
LICENSE = "Apache-2.0"

PV = "0.16.2"

RPM_NAME = "aws-c-mqtt-bin-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "095e914c71a74fc3d560622d9ee1fd7872b128adcba71f94f960f6702bf0f4255fa2cf4c6a37036d5c0b1f780cf1773e620ee640f347aab18c3ae0e6202a8ef8"

RPROVIDES:${PN} += "aws-c-mqtt-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libaws-c-io.so.0unstable \
libaws-c-mqtt.so.1.0.0 \
libaws-c-mqtt1-0-0 \
libc.so.6"

inherit rpm
