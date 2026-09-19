SUMMARY = "Debugging tools for Widelands"
DESCRIPTION = "Additional debugging data for Widelands. This package is not needed for normal \
operation."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "widelands-debug-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "d163d6b07ffba6c941f4e1e68062551fe6561eda3832d8c3ab695dae53e3a732d73d64b94add83fd921dfa8cf4f44da7cec600d5ed3f98ba3b491097edfbcf95"

RPROVIDES:${PN} += "widelands-debug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglbinding.so.3 \
libicuuc.so.78 \
libm.so.6 \
libminizip.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
