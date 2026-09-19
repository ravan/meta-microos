SUMMARY = "Qt 5 gtk3 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk3-based desktop enviroments."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libqt5-qtbase-platformtheme-gtk3-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "730038f653f2f63830af2a3b9d7eacb025e8d813ab9edbf58df687e55c037c744a6ae4d5ab3c00f79a5efcb371f4f0a9ea8cd2a306e5b9594c7f80eb2e342780"

RPROVIDES:${PN} += "libqgtk3.so \
libqt5-qtbase-platformtheme-gtk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
