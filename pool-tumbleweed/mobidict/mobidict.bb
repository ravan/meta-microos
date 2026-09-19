SUMMARY = "A dictionary viewer for AZW/MOBI files"
DESCRIPTION = "A dictionary viewer for AZW/MOBI files."
LICENSE = "GPL-3.0-only"

PV = "1.2"

RPM_NAME = "mobidict-1.2-1.35.aarch64.rpm"
RPM_HASH = "c1bf65ac3bc98122b6780f2fc5702fea715d600ce94db45c218d447b81a165eac0b9decf1450ccaf57a7aca6b7fc49fb31b0b36071eb100030e73cdb835b43fc"

RPROVIDES:${PN} += "mobidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
