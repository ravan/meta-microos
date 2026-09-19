SUMMARY = "A Qt based media player, streamer and downloader"
DESCRIPTION = "QMPlay2 is a video player, it can play and stream all formats supported by \
ffmpeg and libmodplug (including J2B). It has an integrated Youtube \
browser."
LICENSE = "LGPL-3.0-or-later"

PV = "26.08.02"

RPM_NAME = "QMPlay2-26.08.02-1.2.aarch64.rpm"
RPM_HASH = "1e6316495f715320c525aebc4cf4f48b383c6ed852fee94dfe28b6d7c6f41387cf294f960def1d3dc4fc27543a5f88d3be1585b63923c421310a9c4186775ba0"

RPROVIDES:${PN} += "QMPlay2 \
libALSA.so \
libAudioCD.so \
libAudioFilters.so \
libCUVID.so \
libChiptune.so \
libExtensions.so \
libFFmpeg.so \
libInputs.so \
libNotify.so \
libOpenMPT.so \
libPipeWire.so \
libPlaylists.so \
libPortAudio.so \
libPulseAudio.so \
libQPainter.so \
libSubtitles.so \
libVideoFilters.so \
libVisualizations.so \
libXVideo.so \
libqmplay2.so"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXv.so.1 \
libasound.so.2 \
libass.so.9 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcddb.so.2 \
libcdio.so.19 \
libgcc-s.so.1 \
libgme.so.0 \
libm.so.6 \
libpipewire-0.3.so.0 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
librubberband.so.3 \
libsidplayfp.so.7 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libtag.so.2 \
libva-drm.so.2 \
libva.so.2 \
python3 \
shared-mime-info \
update-desktop-files"

inherit rpm
