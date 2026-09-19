SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libavutil-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "a348247a38b7d32b542ebb03b873077c2c3286f7474ea4c32abf2d8fcf6d18679138a76643bfa4dcace82ad1e3fc7b7d5127447a8d4b7d30c11f043859543217"

RPROVIDES:${PN} += "ffmpeg-8-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil60"

inherit rpm
