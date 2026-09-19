SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-avr-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "bc7be45fdc315c60bc3605244975a266c3de1847cd0f1bf5a6e7695d9e30f8df56a17d5023e04acf6ba2b70ee6aa9be1d234f5222bea6d71bf7b1af272a2d89b"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc13"

RDEPENDS:${PN} += "cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
