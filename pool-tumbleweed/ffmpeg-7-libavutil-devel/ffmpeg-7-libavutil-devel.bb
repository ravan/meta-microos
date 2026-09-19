SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libavutil-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "e72be962e07da31613812ccf4d610d712481fbd5b41cd4208d392dc0cba77eaffe9da45e3764ce8ff35c5fa974aae29f904f1ed8696a32feb45b427fe3aabe5f"

RPROVIDES:${PN} += "ffmpeg-7-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil59"

inherit rpm
