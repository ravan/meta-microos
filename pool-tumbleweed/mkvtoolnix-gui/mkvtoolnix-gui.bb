SUMMARY = "Graphical user interface for mkvtoolnix utils"
DESCRIPTION = "This package contains the graphical user interface for the mkvtoolnix utils."
LICENSE = "GPL-2.0-or-later"

PV = "102.0"

RPM_NAME = "mkvtoolnix-gui-102.0-1.1.aarch64.rpm"
RPM_HASH = "29a06f9abae25a8e47c42264745006d3e54cc021f0ee9701717546f549ea4be7310b19c0f30500ca474543075d600a67e5006fbcdbb714d482aeb5909daa0f82"

RPROVIDES:${PN} += "mkvtoolnix-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libcmark.so.0.31.1 \
libdvdread.so.8 \
libebml.so.5 \
libfmt.so.12 \
libgcc-s.so.1 \
libgmp.so.10 \
libmatroska.so.7 \
libpugixml.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
mkvtoolnix \
qt6-multimedia"

inherit rpm
