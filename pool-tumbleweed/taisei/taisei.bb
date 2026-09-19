SUMMARY = "Clone of the Touhou Project series of shoot ’em up games"
DESCRIPTION = "Taisei is an open clone of the Touhou Project series. Touhou is a one-man project \
of shoot ’em up games set in an isolated world full of Japanese folklore."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "taisei-1.4.6-1.1.aarch64.rpm"
RPM_HASH = "ae9bba0aba0270a439f296786e9dc398d3e663df864284dcec293ad54d6ef19acbca4770bdc700f9ae20829c5e110761fc2788deb43ce252ddab4ade8f38d58d"

RPROVIDES:${PN} += "taisei"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6 \
libcrypto.so.3 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglslang-default-resource-limits.so.16 \
libglslang.so.16 \
libm.so.6 \
libmimalloc.so.3 \
libopusfile.so.0 \
libpng16.so.16 \
libspirv-cross-c-shared.so.0 \
libstdc++.so.6 \
libunibreak.so.6 \
libwebpdecoder.so.3 \
libz.so.1 \
libzstd.so.1 \
taisei-data"

inherit rpm
