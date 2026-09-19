SUMMARY = "Header files for AppStream development"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using AppStream. \
 \
This package contains the documentation for AppStream."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.5"

RPM_NAME = "AppStream-devel-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "5a643dfee62980dfa17a6833a73cc2e206c94d687872a5f37bcdb9470c3f90e1ba240ae86f6eca4f4b27a3090509bc608cf524ea5a139dc78a07bfbed5fd9c9d"

RPROVIDES:${PN} += "AppStream-devel \
pkgconfig-appstream"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
AppStream \
libappstream5 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
