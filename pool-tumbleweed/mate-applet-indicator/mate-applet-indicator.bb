SUMMARY = "Information from applications consistently on the panel"
DESCRIPTION = "The indicator applet exposes Ayatana Indicators in the MATE Panel. \
Ayatana Indicators are an initiative by Canonical to provide crisp \
and clean system and application status indication. They take the \
form of an icon and associated menu, displayed (usually) in the \
desktop panel. Existing indicators include the Message Menu, \
Battery Menu and Sound menu."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.28.0"

RPM_NAME = "mate-applet-indicator-1.28.0-1.9.aarch64.rpm"
RPM_HASH = "efe7805d0d1b28ad0977c8e797ad883ea6ac203ebcc3c597170025d181354a67fd7bb137a3fd02602c5dac80ce7f2b13220d1d802b1823439ec68b769c9f1220"

RPROVIDES:${PN} += "ayatana-indicator-renderer \
mate-applet-indicator \
mate-indicator-applet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libayatana-ido3-0.4.so.0 \
libayatana-indicator3.so.7 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1"

inherit rpm
