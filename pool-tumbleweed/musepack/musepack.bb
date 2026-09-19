SUMMARY = "Audio Compression Format"
DESCRIPTION = "Musepack is an audio compression format with an emphasis on audio \
quality. It is not lossless, but it is designed for transparency, so \
that differences between the original wave file and the much smaller \
MPC file are indiscernible (given enough of a bitrate, as usual). \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but has further \
been developed."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later & Zlib"

PV = "r475"

RPM_NAME = "musepack-r475-6.10.aarch64.rpm"
RPM_HASH = "abc9e241403d3a2236b41f798124467d8225712e22688fe0ef0a2f4902b36ef2f167e62e66aeb4133b4082995d9456bbf11e71e73be71fc50de5793825657a3a"

RPROVIDES:${PN} += "musepack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcuefile.so.0 \
libm.so.6 \
libmpcdec.so.6 \
libreplaygain.so.1"

inherit rpm
