SUMMARY = "Plugins for Audacious"
DESCRIPTION = "Plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-only & MIT"

PV = "4.6.1"

RPM_NAME = "audacious-plugins-4.6.1-1.2.aarch64.rpm"
RPM_HASH = "057d5d692da0851947ec35e70fadfe71abc6ded058b82b623e9f450872e4747261df187ac92edda86f817597810cce5c96a17a1b644b1335caec05668b6aa0b6"

RPROVIDES:${PN} += "audacious-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libSDL3.so.0 \
libX11.so.6 \
libXcomposite.so.1 \
libXrender.so.1 \
libasound.so.2 \
libaudcore \
libaudcore.so.6 \
libaudgui.so.7 \
libaudqt.so.4 \
libaudtag.so.4 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libbs2b.so.0 \
libc.so.6 \
libcairo.so.2 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio.so.19 \
libcue.so.2 \
libcurl.so.4 \
libfaad.so.2 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjack.so.0 \
libjson-glib-1.0.so.0 \
liblirc-client.so.0 \
libm.so.6 \
libmms.so.0 \
libmodplug.so.1 \
libmpg123.so.0 \
libmvec.so.1 \
libneon.so.27 \
libnotify.so.4 \
libogg.so.0 \
libopenmpt.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libsndio.so.7 \
libsoxr.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libxml2.so.16 \
libz.so.1"

inherit rpm
