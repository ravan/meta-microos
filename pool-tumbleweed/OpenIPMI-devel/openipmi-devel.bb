SUMMARY = "Development files for OpenIPMI"
DESCRIPTION = "These libraries are needed to get full access to the OpenIPMI \
functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.37.13+git.1181df8"

RPM_NAME = "OpenIPMI-devel-2.0.37.13+git.1181df8-1.6.aarch64.rpm"
RPM_HASH = "78f2ee080fb50c5b2faf3b6b85af65a21c7ae2fa8efb467ace5ff7ab7e0ed22929d411e7767d8a368b81c47d333a39b7986479532cf1e5cae9f34c82bdb5b87e"

RPROVIDES:${PN} += "OpenIPMI-devel \
pkgconfig-OpenIPMI \
pkgconfig-OpenIPMIcmdlang \
pkgconfig-OpenIPMIglib \
pkgconfig-OpenIPMIposix \
pkgconfig-OpenIPMIpthread \
pkgconfig-OpenIPMIui \
pkgconfig-OpenIPMIutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libOpenIPMI0 \
libOpenIPMIui1 \
pkgconfig-OpenIPMI \
pkgconfig-OpenIPMIutils \
pkgconfig-ncurses"

inherit rpm
