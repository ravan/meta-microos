SUMMARY = "C99 implementation of the HTTP/1.1 and HTTP/2 specifications"
DESCRIPTION = "C99 implementation of the HTTP/1.1 and HTTP/2 specifications."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "aws-c-http-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "9d2bd51afe2e1ba3a99f8bf45e1eca11652886754c5680040e9039ca2731fea11374378dca944ce686762eb778bb025e43566ad5c461b98c8939c517fa341e10"

RPROVIDES:${PN} += "aws-c-http"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libc.so.6"

inherit rpm
