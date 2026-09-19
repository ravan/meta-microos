SUMMARY = "Sound Conversion Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "14.4.2"

RPM_NAME = "libsox3-14.4.2-9.11.aarch64.rpm"
RPM_HASH = "319f88f6148983ff189d90ed3a9e3311a43eabe50b491743b25a3b2f02b36caa6839d483de852534bdd9bbee0e4775423c97cf4ecd47a158e88c52d1611e1c82"

RPROVIDES:${PN} += "libsox.so.3 \
libsox3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libao.so.4 \
libasound.so.2 \
libc.so.6 \
libgomp.so.1 \
libgsm.so.1 \
libid3tag.so.0 \
libltdl.so.7 \
libm.so.6 \
libmad.so.0 \
libmagic.so.1 \
libmp3lame.so.0 \
libogg.so.0 \
libopencore-amrnb.so.0 \
libopencore-amrwb.so.0 \
libopusfile.so.0 \
libpng16.so.16 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libtwolame.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
