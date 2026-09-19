SUMMARY = "Development Files for xfconf"
DESCRIPTION = "This package contains the files needed for developing applications using \
xfconf."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "libxfconf-devel-4.20.0-1.9.aarch64.rpm"
RPM_HASH = "423fc4464dca57f5e3c9c8dd6bf1c5e56233b8b444935853444b70192785db8ee40b67fd6e374e720fc594c8a1c698d3d1f015e0301ffdce16542fff98390ba1"

RPROVIDES:${PN} += "libxfce4mcs-devel \
libxfconf-devel \
pkgconfig-libxfconf-0 \
xfce-mcs-manager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfconf-0-3 \
pkgconfig-gio-2.0"

inherit rpm
