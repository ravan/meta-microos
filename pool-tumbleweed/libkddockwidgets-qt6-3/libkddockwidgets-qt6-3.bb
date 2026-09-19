SUMMARY = "Qt dock widget library, suitable for replacing QDockWidget"
DESCRIPTION = "KDDockWidgets is a Qt dock widget library written by KDAB, suitable for \
replacing QDockWidget and implementing advanced functionalities missing in Qt. \
 \
Although KDDockWidgets is ready to be used out of the box, it can also be seen \
as a framework to allow building very tailored custom docking systems. It tries \
to expose every internal widget and every knob for the app developer to tune."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.4.1"

RPM_NAME = "libkddockwidgets-qt6-3-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "3bc2a97ae88645b930596a599bd8466d8f8baa7a59abae347e5e1a56090e49d4b388d41646438be836bcfed290916a221161c376bd5cd2121afa070f9b0e2624"

RPROVIDES:${PN} += "libkddockwidgets-qt6-3 \
libkddockwidgets-qt6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libspdlog.so.1.17 \
libstdc++.so.6"

inherit rpm
