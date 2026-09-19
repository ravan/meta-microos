SUMMARY = "LADSPA plugin for librubberband"
DESCRIPTION = "Package rubberband-ladspa is LADSPA plugin that can change the pitch of a sound in real-time."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "rubberband-ladspa-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "37c8aedea55d63203ddd0e852c3b8ec1e3e17786b2f33f5d65cf0d30cddf35b479b08f0b952e7fe896990b146872a0b25f63e39cce3c09c1c778b243d6224d96"

RPROVIDES:${PN} += "rubberband-ladspa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband3 \
libstdc++.so.6"

inherit rpm
