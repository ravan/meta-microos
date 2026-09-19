SUMMARY = "Libfm-qt libraries"
DESCRIPTION = "Libfm-Qt is a companion library providing components to build desktop file managers"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libfm-qt6-17-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "5531bf0adf46455c0af72d4021eceda52e36290c440d9f401f70237c9965fbc4c2f2573b08ce22db2648286fc052fdbe2a40c2c9aae3555a69470e4b8af87439"

RPROVIDES:${PN} += "libfm-qt6 \
libfm-qt6-17 \
libfm-qt6.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libexif.so.12 \
libfm-qt6-data \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
