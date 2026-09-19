SUMMARY = "C99 implementation of the HTTP/1.1 and HTTP/2 specifications"
DESCRIPTION = "C99 implementation of the HTTP/1.1 and HTTP/2 specifications. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "libaws-c-http1_0_0-0.11.0-1.3.aarch64.rpm"
RPM_HASH = "7fba08e5f332ca59365fe48a00726cd9228afd557db98412439858095241f6f998ca33030c1dfc0832379b9f0cac505442638b1d6c22f50d71e02b1e5f258037"

RPROVIDES:${PN} += "libaws-c-http.so.1.0.0 \
libaws-c-http1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-cal.so.0unstable \
libaws-c-common.so.1 \
libaws-c-compression.so.1.0.0 \
libaws-c-io.so.0unstable \
libc.so.6"

inherit rpm
