SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.201.1"

RPM_NAME = "libpolkit-qt6-1-1-0.201.1-1.3.aarch64.rpm"
RPM_HASH = "bd2abeb547be33586c7d4500175f8c342000937f9ee561d08fb36de89ef730d95f6f109e024548578a4ba1fb84e05493731c74fa88b173bccfab0a4ed279f569"

RPROVIDES:${PN} += "libpolkit-qt6-1-1 \
libpolkit-qt6-agent-1.so.1 \
libpolkit-qt6-core-1.so.1 \
libpolkit-qt6-gui-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6"

inherit rpm
