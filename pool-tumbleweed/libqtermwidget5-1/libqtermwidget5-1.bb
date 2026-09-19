SUMMARY = "Qt5 terminal widget"
DESCRIPTION = "QTermWidget is a project based on the KDE4 \
Konsole application whose goal is to provide a Unicode- \
enabled, embeddable Qt widget to be used as a built-in console (or \
terminal emulation widget). Though Konsole is able of getting embedded, \
it is possible to have Qt without KDE. The original \
Konsole code was rewritten entirely with using Qt only, and all \
code dealing with user interface parts and session management was \
removed."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libqtermwidget5-1-1.4.0-2.7.aarch64.rpm"
RPM_HASH = "39204a461be819efdaf99f0dcb60681126b8a5ae621de4c961d0c19496db4bc79d23152ff1cffe926b9c36e0724b2afd7dba4a6abbe74bad8fadc4d244efd2a6"

RPROVIDES:${PN} += "libqtermwidget5-1 \
libqtermwidget5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libutf8proc.so.3 \
qtermwidget-qt5-data"

inherit rpm
