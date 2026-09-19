SUMMARY = "Development Files for exo"
DESCRIPTION = "This package contains development files needed for developing applications \
based on exo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.0"

RPM_NAME = "exo-devel-4.20.0-2.8.aarch64.rpm"
RPM_HASH = "860c5da7f81b6d26497b4afb74279ca4523a4ce799012e4918af668b1b3c3ac5ab17a3773eb5bc67472884330175b381f141777fc984a00ae8f3657d9a4b3fcf"

RPROVIDES:${PN} += "exo-devel \
pkgconfig-exo-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
exo-tools \
libexo-2-0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4util-1.0"

inherit rpm
