SUMMARY = "Development files for LAL metaio"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL MetaIO library."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "lalmetaio-devel-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "a7dffb8b6cb570d2e998622764edef641174ab2e7e423ba478324fe47acb7157ac3cd4e536ea153ac1344435fd9189f9e164d67e38467bf79bc8759033645cd6"

RPROVIDES:${PN} += "config-lalmetaio-devel \
lalmetaio-devel \
pkgconfig-lalmetaio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalmetaio.so.11 \
liblalmetaio11 \
pkgconfig-lal \
pkgconfig-libmetaio"

inherit rpm
