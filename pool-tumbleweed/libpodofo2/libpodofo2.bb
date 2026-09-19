SUMMARY = "PDF parsing and creation library"
DESCRIPTION = "A cross platform PDF parsing and creation library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libpodofo2-0.10.5-1.8.aarch64.rpm"
RPM_HASH = "122d6abf64f997bd68792dac4be43cdb0d6580589c27878aaa2d17ce756c27228ab5888129bdc328df1b84f35ef3e8af18b84f75b3364ea48cac165300e7394c"

RPROVIDES:${PN} += "libpodofo.so.2 \
libpodofo2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
