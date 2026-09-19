SUMMARY = "Sound editor by KDE"
DESCRIPTION = "Kwave is a sound editor by KDE. \
 \
With Kwave you can edit many sorts of wav-files including multi-channel files. \
You are able to alter and play back each channel on its own. Kwave also \
includes many plugins (most are still under development) to transform the \
wave-file in several ways and presents a graphical view with a complete zoom- \
and scroll capability."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwave-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "dfcaa4baf75fcbf04075a67a87952dee755ee9144b7c558fda573f8971c9cf6d1f426cf5c3791094123d95aff1f37fc0572dda661f3f266a78b323072dba9ff7"

RPROVIDES:${PN} += "kwave \
libkwave.so.26 \
libkwavegui.so.26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOWidgets.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libasound.so.2 \
libaudiofile.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libm.so.6 \
libmad.so.0 \
libogg.so.0 \
libopus.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
