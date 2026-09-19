SUMMARY = "Mobile Broadband Interface Model (MBIM) protocol - Development files"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "1.34.0"

RPM_NAME = "libmbim-devel-1.34.0-1.4.aarch64.rpm"
RPM_HASH = "8f75e74fd02c200c766fcf5ad9b4eae2c2675f1c50c3c63ddaec9a02174820a9c5737ca3506e96f080efd479762ce4104f25cc98c35a05f1ac0ace1501e0aca4"

RPROVIDES:${PN} += "libmbim-devel \
pkgconfig-mbim-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmbim-glib4 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
