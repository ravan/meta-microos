SUMMARY = "Tool for ripping compact discs"
DESCRIPTION = "Audex is an audio grabber tool for CD-ROM drives."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "audex-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "96e37a02fcd08ca51a921245a49367508764176c2407d55cece2d6a0ed7229927e57fba69bebe62c5e1bab1ab21843878c9c512bf4a4c076ae6ce78501a52230"

RPROVIDES:${PN} += "audex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKCddb6.so.5 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Solid.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libstdc++.so.6"

inherit rpm
