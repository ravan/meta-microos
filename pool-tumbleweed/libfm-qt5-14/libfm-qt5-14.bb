SUMMARY = "Library providing components to build desktop file managers"
DESCRIPTION = "libfm-qt is the Qt port of libfm, a library providing components to \
build desktop file managers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libfm-qt5-14-1.4.0-1.13.aarch64.rpm"
RPM_HASH = "1fe3ce88263c4f80a4801df9c1cd913515cac6256ba967ca33231b47f6a3fcf378719eb98c130ede1d9c3deed75e5356c0450f0b28d657132b73c7d269c765cd"

RPROVIDES:${PN} += "libfm-qt.so.14 \
libfm-qt5 \
libfm-qt5-14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libexif.so.12 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
