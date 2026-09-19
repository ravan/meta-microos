SUMMARY = "Shared library files for aws-c-mqtt library"
DESCRIPTION = "AWS C99 implementation of the MQTT 3.1.1 specification. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.16.2"

RPM_NAME = "libaws-c-mqtt1_0_0-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "52bc9b056de1113c35af5e23880a8d5aad3e63ff3e8e571e05ba1579b41228e3451a286651216df88b686208616dcc2b40f784e2312a73b494be5ebea0ddeaec"

RPROVIDES:${PN} += "libaws-c-mqtt.so.1.0.0 \
libaws-c-mqtt1 \
libaws-c-mqtt1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libc.so.6"

inherit rpm
