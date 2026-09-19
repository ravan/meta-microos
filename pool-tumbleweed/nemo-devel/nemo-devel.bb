SUMMARY = "Development files for Nemo"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides the development files for Nemo."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "nemo-devel-6.6.4-1.1.aarch64.rpm"
RPM_HASH = "8579feaa069fb5d3e6e98da5724ba85077f2db49a79687eb5c8a5472d9a6e9535ff0ace2448a4883312c518139162db3c57846584a9806e1933da6a3851e893e"

RPROVIDES:${PN} += "nemo-devel \
pkgconfig-libnemo-extension"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnemo-extension1 \
nemo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Nemo-3-0"

inherit rpm
