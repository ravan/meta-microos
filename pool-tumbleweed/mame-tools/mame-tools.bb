SUMMARY = "MAME Tools"
DESCRIPTION = "Tools for use with MAME/MESS roms and images."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.289"

RPM_NAME = "mame-tools-0.289-1.1.aarch64.rpm"
RPM_HASH = "567ec9b623bb03ae57754496eae788f1cf8290286408d85932342f9dd72a5fb3faa825e39a07bfb8f537e050f2e48e2efd83209c5eab5c0c3312a85845da527e"

RPROVIDES:${PN} += "mame-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libSDL2-2.0.so.0 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libutf8proc.so.3 \
libz.so.1"

inherit rpm
