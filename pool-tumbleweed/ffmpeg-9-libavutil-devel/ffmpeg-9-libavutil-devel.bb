SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libavutil-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "94bfd79ed11d61dfc7d198e444ab8741c36f2f1740bc57d3477f22a0c888dc657bd0edd8cffd38135e4b5f2c18e0d57b98ce2576f511581772fb11368aa748b3"

RPROVIDES:${PN} += "ffmpeg-9-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil61"

inherit rpm
