SUMMARY = "Development files for the Single Sign On Framework's plugins"
DESCRIPTION = "This package contains the development files necessary for creating plugins for \
the Single Sign On Framework."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signon-plugins-devel-8.61-2.10.aarch64.rpm"
RPM_HASH = "a92e8bf894e37ed3ba5814e5e2144ebc6bfb4f1102cc88b26af96da5e81b03461e562bec9c43feb0d3182af926921258a24b11ad7cb9ac334e81a195877818a3"

RPROVIDES:${PN} += "pkgconfig-signon-plugins \
pkgconfig-signon-plugins-common \
signon-plugins-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt6-devel \
pkgconfig-libsignon-qt6 \
signon-plugins"

inherit rpm
