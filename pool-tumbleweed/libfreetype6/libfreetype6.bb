SUMMARY = "A TrueType Font Library"
DESCRIPTION = "This library features TrueType fonts for open source projects. This \
version also contains an autohinter for producing improved output."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.14.3"

RPM_NAME = "libfreetype6-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "2c64e54581f9c63b08c7b7cacf5414f00e92be7b6adde7b0da87d788073d7b17e97b091c90963317784e2ecacc74f5e2d232d3c7b8f0e45e63cc58470d3fe7b0"

RPROVIDES:${PN} += "freetype2 \
libfreetype.so.6 \
libfreetype6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbz2.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
