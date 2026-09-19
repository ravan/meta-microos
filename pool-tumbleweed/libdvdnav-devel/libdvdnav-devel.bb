SUMMARY = "Development Environment for libdvdnav"
DESCRIPTION = "This library contains functions to display DVD video menus."
LICENSE = "GPL-2.0-or-later"

PV = "7.0.0"

RPM_NAME = "libdvdnav-devel-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "333eb5fcf35c7b5ca99c2765d2996b73caa0fd4f083b60e651e8bd47a85ac707d8afa7167a510b3ede00e51398d2a260b80328d59460c97c2f89bb2bfedb11c6"

RPROVIDES:${PN} += "libdvdnav-devel \
pkgconfig-dvdnav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvdnav4 \
pkgconfig-dvdread"

inherit rpm
