SUMMARY = "Search provider for GNOME shell overview for qalculate-gtk"
DESCRIPTION = "Qalculate is a multi-purpose cross-platform desktop calculator. This package \
provides a search provider for qalculate on the gnome-shell overview."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "gnome-shell-search-provider-qalculate-gtk-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "c732e4d81d210a597785c1a5c51b123f7fdafd2b741460a1cc1589c4d4650bbe5f5dcea2849a246d65d4e97e569db477b1459fc2c755b3cbdfedd55510aabef0"

RPROVIDES:${PN} += "gnome-shell-search-provider-qalculate-gtk"

RDEPENDS:${PN} += "gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libqalculate.so.23 \
libstdc++.so.6 \
qalculate-gtk"

inherit rpm
