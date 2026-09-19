SUMMARY = "Quake III"
DESCRIPTION = "Quake III first person shooter. This package only includes the binary \
files, you still need the data files from the original Quake III CD or \
the Demo."
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20250612"

RPM_NAME = "ioquake3-1.36+git.20250612-1.5.aarch64.rpm"
RPM_HASH = "aa2a046b349275d8dcb82b0be4846b2a78ed8013d40813aa3f73ad36948d8be89369e50b034f26439d29d3b2473fa49bcabf425885bb27726eb0f931544d5f10"

RPROVIDES:${PN} += "ioquake3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libmvec.so.1 \
libopus.so.0 \
libopusfile.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
