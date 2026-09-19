SUMMARY = "Prusa Block & Binary G-code reader / writer / converter"
DESCRIPTION = "A new G-code file format -- Binarize Library \
 \
Contains the definitions and functionality which allow to write a G-code file in binary format"
LICENSE = "AGPL-3.0-only"

PV = "0.2.0+git20240829.b5c57c4"

RPM_NAME = "libbgcode_binarize0_2_0-0.2.0+git20240829.b5c57c4-2.4.aarch64.rpm"
RPM_HASH = "df7e74123eb45498c421da232357d6e88571b7496cec63a3180de0d636d1a10cc6108da411c564295d8c80918238977c05cc927688065fd973538614744109a8"

RPROVIDES:${PN} += "libbgcode-binarize.so.0.2.0 \
libbgcode-binarize0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbgcode-core.so.0.2.0 \
libc.so.6 \
libgcc-s.so.1 \
libheatshrink-dynalloc.so.0.4.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
