SUMMARY = "Shared library for libmetaio - LIGO Light-Weight XML library"
DESCRIPTION = "This package contains the shared-object libraries needed to run applications \
that use the LAL MetaIO library."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "liblalmetaio11-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "1cadd2c24d99816b1ba8f7c260c768dc3aef011cecf6b9a9bd992b951b6bfa33a9fc10f06d3ec7322470f82bd7336d498a98d3371657cc3b421c7fd5c02795cc"

RPROVIDES:${PN} += "liblalmetaio.so.11 \
liblalmetaio11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalsupport.so.14 \
libmetaio.so.1"

inherit rpm
