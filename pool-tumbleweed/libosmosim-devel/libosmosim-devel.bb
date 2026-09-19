SUMMARY = "Development files for the Osmocom SIM card utility library"
DESCRIPTION = "The libosmosim library in particular contains routines for SIM card \
access. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmosim."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmosim-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "83fab2fa500924d8bacc6c57f27b1707987e62215aec3ecbbc35f48ebc43077ccdde75a265a0082576bbc7dd89c81eb311fdc1cbdf53fa0e3264e44811c2b214"

RPROVIDES:${PN} += "libosmosim-devel \
pkgconfig-libosmosim"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmosim2 \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
