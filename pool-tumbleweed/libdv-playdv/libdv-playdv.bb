SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M. \
 \
This package contains the playdv sample application."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-playdv-1.0.0-181.2.aarch64.rpm"
RPM_HASH = "1bd733f409351a463f3b50fb68718a13fe6da0a3f4ed5192697bba3a02eef9e0629eb025500a58ff42ac9585c45757cc1bfc74581499b8ee2c180b959c5aded3"

RPROVIDES:${PN} += "libdv-playdv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libc.so.6 \
libdv.so.4 \
libgdk-x11-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpopt.so.0"

inherit rpm
