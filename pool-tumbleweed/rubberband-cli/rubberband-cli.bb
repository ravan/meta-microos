SUMMARY = "Command line interface for librubberband"
DESCRIPTION = "Package rubberband-cli contains a command-line utility that can be used to exploit \
Rubber Band's capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "rubberband-cli-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "af5c311cc5e20209694a4cb89a4b8c5cebcf7248324ffbdfa35769ed9ac95b38872fdbfaeee9f35895a6a5986b30d4443b287eb14be0020c7f7ae34335804443"

RPROVIDES:${PN} += "rubberband-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband3 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
