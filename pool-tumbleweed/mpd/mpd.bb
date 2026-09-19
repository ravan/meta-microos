SUMMARY = "Music Player Daemon"
DESCRIPTION = "A daemon for playing music (mp3, ogg vorbis, flac, and wav).  Music is \
played through the server's audio device.  The daemon stores info \
about all available music, and this info can be easily searched and \
retrieved.  Player control, info retrieval, and playlist management \
can all be managed remotely. There a bunch of clients to control mpd: \
for GTK, Qt, and console."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.15"

RPM_NAME = "mpd-0.24.15-1.1.aarch64.rpm"
RPM_HASH = "41a4662b7f1d3892a89be0a7c490be6c8032485a9ec28c7b465ed2d10766add8c044465f231fb180292f8149a49701d93c3fd6cc8b770b7a9287f2a0611ae09f"

RPROVIDES:${PN} += "config-mpd \
mpd \
user-mpd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-audio \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libao.so.4 \
libasound.so.2 \
libaudiofile.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libbz2.so.1 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libcurl.so.4 \
libdbus-1.so.3 \
libexpat.so.1 \
libfaad.so.2 \
libfluidsynth.so.3 \
libfmt.so.12 \
libgcc-s.so.1 \
libgme.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libid3tag.so.0 \
libiso9660.so.12 \
libjack.so.0 \
libm.so.6 \
libmad.so.0 \
libmikmod.so.3 \
libmms.so.0 \
libmodplug.so.1 \
libmp3lame.so.0 \
libmpdclient.so.2 \
libmpg123.so.0 \
libnfs.so.16 \
libnpupnp.so.13 \
libogg.so.0 \
libopenal.so.1 \
libopenmpt.so.0 \
libopus.so.0 \
libpcre2-8.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libshine.so.3 \
libshout.so.3 \
libsidplayfp.so.7 \
libsmbclient.so.0 \
libsndfile.so.1 \
libsndio.so.7 \
libsoxr.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libtwolame.so.0 \
liburing.so.2 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libwavpack.so.1 \
libz.so.1 \
libzzip.so.13 \
shadow \
systemd"

inherit rpm
