SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "6.6.0"

RPM_NAME = "cinnamon-control-center-devel-6.6.0-1.3.aarch64.rpm"
RPM_HASH = "82f9b60070ee7e502a0f864f7376dd52d0df03eecf31a32dfb2917377b1b6baee4717313b5b41433dce31db2c01715014af25ce2a3c7f0f8cef889a9998f5422"

RPROVIDES:${PN} += "cinnamon-control-center-devel \
pkgconfig-libcinnamon-control-center"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcinnamon-control-center1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
