SUMMARY = "OpenAL Soft HRTF generation utility"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains the makemhr utility for creating head-related \
transfer functions (HRTF)."
LICENSE = "GPL-2.0-or-later"

PV = "1.24.3~179"

RPM_NAME = "openal-soft-makemhr-1.24.3~179-1.6.aarch64.rpm"
RPM_HASH = "67a7a20222c75cda2aad0e42534bb6baaaf1739819572dfa8b54ca067e9a836bd5251e1be29099b5b2003fd9cd6d1476c1a5776d9e8752dc26251f00d7ab907e"

RPROVIDES:${PN} += "makehrtf \
openal-soft-devel-/usr/bin/makehrtf \
openal-soft-makemhr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmysofa.so.1 \
libstdc++.so.6"

inherit rpm
