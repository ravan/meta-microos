SUMMARY = "Libraries and headers for adding NetworkManager support to applications"
DESCRIPTION = "This package contains various headers accessing some NetworkManager \
functionality from applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-devel-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "176cd87abe93b21789f1ea4de9f130f8fdf31febf87bd4b614eff7b19d7cc8d72d8c5dee0378e4f54374030f3c7c25772c1bb710c896dea1f2b72cfc82225ee3"

RPROVIDES:${PN} += "NetworkManager-devel \
NetworkManager-doc \
pkgconfig-libnm \
rpm-macro--vpnservicedir"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
NetworkManager \
libnm0 \
pkgconfig-gio-2.0 \
typelib-1-0-NM-1-0"

inherit rpm
