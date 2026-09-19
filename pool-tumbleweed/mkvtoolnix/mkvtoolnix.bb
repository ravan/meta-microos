SUMMARY = "Tools to Create, Alter, and Inspect Matroska Files"
DESCRIPTION = "Tools to create and manipulate Matroska files (extensions .mkv and .mka), a new \
container format for audio and video files. Includes command line tools \
mkvextract, mkvinfo, mkvmerge and mkvpropedit."
LICENSE = "GPL-2.0-or-later"

PV = "102.0"

RPM_NAME = "mkvtoolnix-102.0-1.1.aarch64.rpm"
RPM_HASH = "1e927dea17fdac2dbe0aa027baa5729437179af073969e11c62bbbd8fc353efa0468f50ca967707c2c2213f57136efd624cdf8e3c604782f130ede1bb5233016"

RPROVIDES:${PN} += "mkvtoolnix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libQt6Core.so.6 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libdvdread.so.8 \
libebml.so.5 \
libfmt.so.12 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmatroska.so.7 \
libogg.so.0 \
libpugixml.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libz.so.1"

inherit rpm
