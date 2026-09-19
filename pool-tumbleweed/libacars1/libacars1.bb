SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libacars1-1.3.1-1.27.aarch64.rpm"
RPM_HASH = "e92fa310254dc818a24cf750dc4ae6ab40ab9f7db2bd971c4473c4b1941e43139c89bce1d43600420e9bbc7873a9eb5d7475d42f07308f234f05790ec35e9620"

RPROVIDES:${PN} += "libacars.so.1 \
libacars1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
