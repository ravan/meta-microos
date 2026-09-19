SUMMARY = "Qt based Color Picker with popup menu"
DESCRIPTION = "QToolButton with color popup menu with lets you select a color. The popup \
featues a color dialog button which can be used to add custom colors to the \
popup menu."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libkColorPicker-Qt5-0-0.3.1-1.9.aarch64.rpm"
RPM_HASH = "ab488646498fefc0e98dbfa98e41bee1f8480d6fed6edfd516c9630524ea414efccf073a35bc4f73b15fce72805fc01970ecae40cc944e5dd2296279245d1440"

RPROVIDES:${PN} += "libkColorPicker-Qt5-0 \
libkColorPicker-Qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
