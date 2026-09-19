SUMMARY = "Header Files Required for Developing Plugins for pppd"
DESCRIPTION = "The package ppp-devel contains C header files required for developing \
plugins for the pppd."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.5.2"

RPM_NAME = "ppp-devel-2.5.2-3.4.aarch64.rpm"
RPM_HASH = "d9a0fb307cdce16061e2d5c1eadaf89ce0ef2a3548d6c324b385b1be12c361e115b51da42db3fbe5e60706ba5155f541a18b551102a9e234171ac3d1a4a8d116"

RPROVIDES:${PN} += "pkgconfig-pppd \
ppp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ppp"

inherit rpm
