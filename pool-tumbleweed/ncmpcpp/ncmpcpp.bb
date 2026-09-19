SUMMARY = "Music Player Daemon Client"
DESCRIPTION = "ncmpcpp is an ncurses client for MPD (Music Player Daemon), inspired \
by ncmpc. It features a tag editor, playlist editor, search engine, \
media library, music visualizer, a last.fm artist database \
information fetcher and an alternative user interface."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "ncmpcpp-0.10.1-1.10.aarch64.rpm"
RPM_HASH = "47dd17cf40cc662e7d21eb480dc3b794afc67132bcc9a35bd5efa23a5072017518d31eea5972f8bd3641691c4f06d8d360df757a75eab026aa91d367bad05f1e"

RPROVIDES:${PN} += "ncmpcpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcurl.so.4 \
libfftw3.so.3 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libmpdclient.so.2 \
libmvec.so.1 \
libncursesw.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtag.so.2 \
libtinfo.so.6 \
mpd"

inherit rpm
