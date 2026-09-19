SUMMARY = "GTK+ audio player"
DESCRIPTION = "DeaDBeeF is an audio player using GTK+. Through use of the ffmpeg \
libraries, it supports many formats. It also supports cuesheets, \
chiptune formats with subtunes, song-length databases. It can be \
extended using plugins (DSP, GUI, output, input, etc.). The GUI looks \
similar to Foobar2000."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & Zlib & LGPL-2.1-or-later"

PV = "1.10.2"

RPM_NAME = "deadbeef-1.10.2-3.3.aarch64.rpm"
RPM_HASH = "7d7e76cc8c41e0e8a96a062717567eef8c0e26dcafc19cc0c3f919e998a85d7db952640f8e832864e564dd2f46d351798aea7b18042dc82134cee392d401c7c3"

RPROVIDES:${PN} += "deadbeef \
deadbeef-plugin-mpris2 \
deadbeef-plugins-extra \
deadbeef-restricted-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libBlocksRuntime.so.1.3 \
libFLAC.so.14 \
libasound.so.2 \
libatk-1.0.so.0 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcairo.so.2 \
libcddb.so.2 \
libcdio.so.19 \
libcurl.so.4 \
libdbus-1.so.3 \
libdispatch.so.1.3 \
libfaad.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-x11-2.0.so.0 \
libjansson.so.4 \
libm.so.6 \
libmad.so.0 \
libmpg123.so.0 \
libogg.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libz.so.1 \
libzip.so.5"

inherit rpm
