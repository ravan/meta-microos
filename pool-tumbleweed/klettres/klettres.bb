SUMMARY = "Alphabet Learning Game"
DESCRIPTION = "Helps to learn the alphabet and read some syllables."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "klettres-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3593c017bbe3ec0ff204462f9461b2ba14111f87d0f7599aee55564f58863e8936eeeb67cc1e4175606d8e30416d0b443879dc00bf4522da4ff6ad1e8ec92252"

RPROVIDES:${PN} += "klettres \
klettres5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
