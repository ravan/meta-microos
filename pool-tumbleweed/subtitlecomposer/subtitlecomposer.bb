SUMMARY = "A text-based subtitle editor"
DESCRIPTION = "A text-based subtitles editor that supports basic operations. It supports \
SubRip (SRT), MicroDVD, SSA/ASS, MPlayer, TMPlayer and YouTube captions, and \
has speech Recognition using PocketSphinx."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "subtitlecomposer-0.8.2-2.14.aarch64.rpm"
RPM_HASH = "ce009d92ef33f9743d944f1132c2a986dd7c08c347fc7f2710c698462dbe3032cfc4c6622bd8d4ed48c51d932dd897c35482bd064176b674b04575d1d68ea6fc"

RPROVIDES:${PN} += "config-subtitlecomposer \
subtitlecomposer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcrypto.so.3 \
libicui18n.so.78 \
libm.so.6 \
libopenal.so.1 \
libpocketsphinx.so.5 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9"

inherit rpm
