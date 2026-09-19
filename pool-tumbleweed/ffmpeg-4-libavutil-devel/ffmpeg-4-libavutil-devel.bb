SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libavutil-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "a4b2c5f177a2c2ed6ba89acad2ca92e38f147db21398d14e6e593467cf537cb29f27845214a314c5e83de83b4bd8b41f4bfefa0303a3a1b4aded276f8c1b60bf"

RPROVIDES:${PN} += "ffmpeg-4-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil56-70"

inherit rpm
