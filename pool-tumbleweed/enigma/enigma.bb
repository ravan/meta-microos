SUMMARY = "An Excellent Oxyd Clone"
DESCRIPTION = "Enigma is similar to the well known game Oxyd."
LICENSE = "GPL-2.0-or-later"

PV = "1.30"

RPM_NAME = "enigma-1.30-3.1.aarch64.rpm"
RPM_HASH = "3f0fa135309e76dd631bc6deda0217ffcf3ec73ad27dc7c98825f4a346c976affd1e7b3ac7b268f757ed790d53c14b7bcbcf6e47a7a7e4b36bc31643f99cbd04"

RPROVIDES:${PN} += "enigma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libenet.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libz.so.1"

inherit rpm
