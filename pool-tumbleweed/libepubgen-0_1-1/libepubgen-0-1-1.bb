SUMMARY = "An EPUB generator library"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-0_1-1-0.1.1-1.32.aarch64.rpm"
RPM_HASH = "302900db3d114c15962c71b7a62c5481ec014325f8fddd20de22332f264c7ee57dde3997048477d42f79168ac3536d587045753ec34724151f6af77803db1180"

RPROVIDES:${PN} += "libepubgen-0-1-1 \
libepubgen-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
