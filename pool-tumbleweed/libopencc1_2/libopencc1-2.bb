SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides shared libraries of OpenCC."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "libopencc1_2-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "3377cefce6c6871b73dc35aea3a66d415a26cffe3af91c1fe9abf0b6b65d3f61446caa999e5095476604b877cb52c75be8bdf41af37ebd14e57abf13cacbbf9a"

RPROVIDES:${PN} += "libopencc.so.1.2 \
libopencc1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
opencc-data"

inherit rpm
