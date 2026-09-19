SUMMARY = "Header files for libosinfo, an OS/hypervisor information library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination. \
 \
This package provides includes to compile with the libosinfo library, \
as well as Vala bindings for the libosinfo library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.12.0"

RPM_NAME = "libosinfo-devel-1.12.0-3.6.aarch64.rpm"
RPM_HASH = "630b314102305eb07d566702a3c2d5bc7a982bb32eb15cc809af8a30031f1426c8dd48da5776fdaec02fdf2186d8b63a7ec8ae65b50140dec7ac5e86edea506a"

RPROVIDES:${PN} += "libosinfo-devel \
pkgconfig-libosinfo-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosinfo-1-0-0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Libosinfo-1-0"

inherit rpm
