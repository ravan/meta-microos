SUMMARY = "Taglib plugin for nulloy"
DESCRIPTION = "This package contains the taglib plugin for nulloy - a music player \
with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "nulloy-taglib-0.9.9-1.3.aarch64.rpm"
RPM_HASH = "15ea33ac1f32e65ef2f8f40cb274f9c61cbbb1a7524394f8f2fca2d37f016bd5a7f571a72fd895c71e2d29edacc5de8331b65590dcf28082043e45e87a441e45"

RPROVIDES:${PN} += "libplugin-taglib.so \
nulloy-taglib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.2 \
nulloy"

inherit rpm
