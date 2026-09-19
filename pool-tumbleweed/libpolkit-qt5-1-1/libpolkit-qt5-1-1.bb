SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.201.1"

RPM_NAME = "libpolkit-qt5-1-1-0.201.1-1.3.aarch64.rpm"
RPM_HASH = "f7b2b63729df664537e1a7af0beab81daba908de479079b2fff394a375f718ab66a242a63110722fe17f550fd5f7b4bbe678e69938897fc80591a0567d608908"

RPROVIDES:${PN} += "libpolkit-qt5-1-1 \
libpolkit-qt5-agent-1.so.1 \
libpolkit-qt5-core-1.so.1 \
libpolkit-qt5-gui-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libstdc++.so.6"

inherit rpm
