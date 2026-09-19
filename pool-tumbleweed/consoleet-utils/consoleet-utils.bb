SUMMARY = "Utilities for manipulating terminal fonts and colors"
DESCRIPTION = "This is a set of utilities for manipulating terminal fonts and \
colors. \
 \
A key component is vfontas, which can read/write bitmap fonts from/to \
a number of formats and transform the glyphs in various ways. vfontas \
is able to generate outline fonts from bitmapped fonts, including a \
high-quality mode that upscales based on outline rather than pixel \
blocks, setting it apart from scalers like xBRZ or potrace."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "1.11"

RPM_NAME = "consoleet-utils-1.11-1.6.aarch64.rpm"
RPM_HASH = "ad77a9da078d92e4671c9a16a4c5c313fb619c7a563fcf3c71e401cae72bfb2ddbe84c1c01d38b5f33cff2877e451e3fb998572d90811f563359c1e3527a739e"

RPROVIDES:${PN} += "consoleet-utils \
vfontas"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libbabl-0.1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
