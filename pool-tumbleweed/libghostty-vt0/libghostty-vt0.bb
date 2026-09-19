SUMMARY = "C-compatible library for embedding a fast, feature-rich terminal emulator"
DESCRIPTION = "A zero-dependency library that provides an API for parsing terminal sequences \
and maintaining terminal state, extracted directly from Ghostty's real-world proven core"
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "libghostty-vt0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "95120d306c5f6a766d35bd155434e6624b4d8f2740855b168b2220a99a5af70e0cb750cce08b8705b72548524ffb18ab9288ff0ef4a672321c2d9faf586ade9a"

RPROVIDES:${PN} += "libghostty-vt.so.0 \
libghostty-vt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libhwy.so.1 \
libsimdutf.so.35"

inherit rpm
