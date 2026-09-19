SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-1.2.4+git20180804.fff99cd-9.7.aarch64.rpm"
RPM_HASH = "6a25337e5d1c9408efd0a264b7610b97f87952faa6066beb6a34f0748bc89f52dd00af5b8e75a2e896447646b3b0d2ab320add2ac81f68ecfbc6a4e8c75b0c30"

RPROVIDES:${PN} += "libquicktime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libfaad.so.2 \
libjpeg.so.8 \
libm.so.6 \
libmp3lame.so.0 \
libpng16.so.16 \
libquicktime.so.0 \
libschroedinger-1.0.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
