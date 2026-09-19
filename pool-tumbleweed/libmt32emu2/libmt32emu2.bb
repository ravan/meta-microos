SUMMARY = "Shared library for mt32emu"
DESCRIPTION = "A multi-platform software synthesiser emulating pre-GM MIDI devices such as the Roland MT-32, CM-32L, CM-64 and LAPC-I. \
This package provides the mt32emu library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.8.3"

RPM_NAME = "libmt32emu2-2.8.3-1.3.aarch64.rpm"
RPM_HASH = "8f90b9bf4a0709adae1c0d08a5c5b39d7a66d13e38d1928c6c16d3d42796daeadf62944de7fe2a408d6f86dc65975f67c0cab463050260365367154c4a85e7fe"

RPROVIDES:${PN} += "libmt32emu.so.2 \
libmt32emu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
