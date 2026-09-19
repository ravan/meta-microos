SUMMARY = "KDE I/O Slave for Audio CDs"
DESCRIPTION = "This package contains an KIO slave to access audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kio_audiocd-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9be9fb6782000fa4a57b03388c7bc3c1a8f31400f6540c2ebb7ee2e63f7b135d702544caa0b869b1befac4621e95110524214a7b340b055fa53c59bafbdb5a48"

RPROVIDES:${PN} += "kio-audiocd \
libaudiocd-encoder-flac.so \
libaudiocd-encoder-lame.so \
libaudiocd-encoder-opus.so \
libaudiocd-encoder-vorbis.so \
libaudiocd-encoder-wav.so \
libaudiocdplugins.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libKCddb6.so.5 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcdda-interface.so.0 \
libcdda-paranoia.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
