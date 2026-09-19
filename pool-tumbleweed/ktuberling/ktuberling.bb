SUMMARY = "Potato drawing editor"
DESCRIPTION = "KTuberling is a nice potato editor for kids. The game intended for \
small children. Of course, it may be suitable for adults who have \
remained young at heart. Eyes, mouths, mustache, and other parts of \
face and goodies can be attached onto a potato-like guy."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktuberling-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9ec54c02913ae659b4cca31592ca5876e00d58a9e75499441aaf94a71ee1143dcf226103392b9bfd702ea2a44825504ea9badfa319d3d9e7f069c6695ba7ff47"

RPROVIDES:${PN} += "ktuberling \
ktuberling5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
