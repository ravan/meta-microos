SUMMARY = "Automatic Mouse Click"
DESCRIPTION = "Clicks the mouse for you, reducing hand strain."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kmousetool-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "085bd74ed15c2194592498b8195426452587ad37b44bee064157151dbcc3016e9deeabc388fda2a8e931ec9680a56d0f60f045dba8aa32b13d5558e8578a6222"

RPROVIDES:${PN} += "kmousetool \
kmousetool5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
