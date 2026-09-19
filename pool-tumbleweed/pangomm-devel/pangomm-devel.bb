SUMMARY = "Development files for pangomm, a C++ API for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.56.2"

RPM_NAME = "pangomm-devel-2.56.2-1.3.aarch64.rpm"
RPM_HASH = "7c03feea60ed686af2cf5f084b7eaa9df12e254b348e06eab2a5a3746ee13785e69885e9512992887bd7cd373a1bc874c07e9e9842049eb6865f0b899299b10b"

RPROVIDES:${PN} += "pangomm-devel \
pkgconfig-pangomm-2.48"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpangomm-2-48-1 \
pkgconfig-cairomm-1.16 \
pkgconfig-giomm-2.68 \
pkgconfig-pangocairo"

inherit rpm
