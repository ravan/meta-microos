SUMMARY = "Desktop Recorder"
DESCRIPTION = "recordMyDesktop is a program that captures audio and video data from a Linux \
desktop session, producing an Ogg-encapsulated Theora-Vorbis file. The main \
goal is to be as unobstrusive as possible by proccessing only regions of the \
screen that have changed."
LICENSE = "GPL-2.0"

PV = "0.4.0"

RPM_NAME = "recordmydesktop-0.4.0-1.21.aarch64.rpm"
RPM_HASH = "bde6f1ec267331253bd3b3631a389459b86ffdf0a71989d9a9cf36ead9b830d19be77e50e48f238c9ba5b382213cecb02f1a5691f45b741d095a79bc631acc03"

RPROVIDES:${PN} += "recordmydesktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libasound.so.2 \
libc.so.6 \
libjack.so.0 \
libm.so.6 \
libogg.so.0 \
libpopt.so.0 \
libtheora.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libz.so.1"

inherit rpm
