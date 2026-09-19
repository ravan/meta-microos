SUMMARY = "C99 implementation of the vnd.amazon.eventstream content-type"
DESCRIPTION = "C99 implementation of the vnd.amazon.eventstream content-type. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.7.2"

RPM_NAME = "libaws-c-event-stream1-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "204626e17d70a79a257c515d427bc0599248443d7314e49de6c65810d42dbb56084ad50e397d85d71da9dabea67dcab4711f97de8fef3e629d03275200327e26"

RPROVIDES:${PN} += "libaws-c-event-stream.so.1 \
libaws-c-event-stream1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libaws-c-io.so.0unstable \
libaws-checksums.so.1 \
libc.so.6"

inherit rpm
