SUMMARY = "The Speech Synthesis System"
DESCRIPTION = "Festival is a multilingual speech synthesis system developed at CSTR. \
It offers a full text-to-speech system with various APIs as well as an \
environment for development and research of speech synthesis \
techniques. It is written in C++ and has a Scheme-based command \
interpreter for general control."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "festival-2.5.0-16.1.aarch64.rpm"
RPM_HASH = "6923f5aa98b9bf03cd862d3d7bfa5478c180a82dd711c17d628da0b25d1a462921b0ad2c44659ac68dbdd98dce363aa344a5e5ce9496e481132a4d0dd54f1543"

RPROVIDES:${PN} += "config-festival \
festival"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
shadow"

inherit rpm
