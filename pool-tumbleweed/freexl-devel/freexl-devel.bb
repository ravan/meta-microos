SUMMARY = "Development files for freexl"
DESCRIPTION = "This package contains all necessary include files and libraries needed to \
compile and develop applications that use libspatialite."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "freexl-devel-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "8d908876c202f28af145ba795246d803eda52b00e4ba6c64a1f6730a8ac2c4ac274bb50b25a99993958db6458480a63dac0cd26d17683bb1affe9196b6af912d"

RPROVIDES:${PN} += "freexl-devel \
pkgconfig-freexl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfreexl1 \
pkgconfig"

inherit rpm
