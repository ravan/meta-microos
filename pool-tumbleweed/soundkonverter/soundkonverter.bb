SUMMARY = "Audio file converter, CD ripper and Replay Gain tool"
DESCRIPTION = "soundKonverter is a frontend to various audio converters."
LICENSE = "GPL-2.0-only"

PV = "3.0.1+git20240225"

RPM_NAME = "soundkonverter-3.0.1+git20240225-3.7.aarch64.rpm"
RPM_HASH = "67a23d7f649430378cb8b765a216a1b36e77dfa9bf55e5627d96b9422a689df58110f46e4567a7285927c9d59fd2e8c33825cd4bd3d31589a76235f11818258b"

RPROVIDES:${PN} += "libsoundkonvertercore.so \
soundkonverter"

RDEPENDS:${PN} += "/sbin/ldconfig \
cdparanoia \
flac \
ld-linux-aarch64.so.1 \
libKF5Cddb.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libtag.so.2 \
speex \
vorbis-tools \
wavpack"

inherit rpm
