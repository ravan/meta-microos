SUMMARY = "Low-level DVD Authoring Tools"
DESCRIPTION = "dvdauthor is a program that will generate a DVD-Video movie from a \
valid MPEG-2 stream. To start you need MPEG-2 files that contain \
the necessary DVD-Video VOB packets. These can be generated with \
FFmpeg, or by by passing `-f 8` to `mplex`."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "dvdauthor-0.7.2-7.5.aarch64.rpm"
RPM_HASH = "ae09882f8ff9ec49fa03b64e62d7ba20f8b49f31b4cc87a74790746d8817bbba82d697c2b3ccefcf3ff7bde4b48ca9d1c31034e0a2296b7afa552845dd5af069"

RPROVIDES:${PN} += "dvdauthor \
dvdauthor07"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8 \
libfreetype.so.6 \
libfribidi.so.0 \
libm.so.6 \
libpng16.so.16 \
libxml2.so.16"

inherit rpm
