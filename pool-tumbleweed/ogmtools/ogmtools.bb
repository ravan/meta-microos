SUMMARY = "Tools for OGG Media Streams"
DESCRIPTION = "These tools allow information about (ogminfo), extraction from \
(ogmdemux), creation of (ogmmerge), or the division of (ogmsplit) OGG \
media streams.	OGM stands for OGG media streams."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ogmtools-1.5-169.9.aarch64.rpm"
RPM_HASH = "986b28ec5847e2cfbff077b8215289290746eaaae396e8fb0d3556dbf544d3467e58c3978f0973c1b0250e2423474c5000e2f6c1f836ff17f50c7b573cb612ae"

RPROVIDES:${PN} += "ogmtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8 \
libgcc-s.so.1 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
