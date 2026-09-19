SUMMARY = "Tools for converting and editing digital video (DV) data"
DESCRIPTION = "These tools can be used to convert DV to image streams, avi or mov \
files and back, duplicate or drop frames and to convert kino projects \
to DV, raw audio and raw yuv video \
 \
More details can be found using 'man smilutils' and at: \
http://users.pandora.be/acp/kino/smilutils.html"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2+cvs20070731"

RPM_NAME = "smilutils-0.3.2+cvs20070731-23.7.aarch64.rpm"
RPM_HASH = "7c2e954022fb7d5290d922803454716898d423ba83934d80bb556d3947db8d639057a61cba8bd098f70a80dce2fc2881e526361905e1219a9fbe7c6be518902d"

RPROVIDES:${PN} += "libkinoextensions.so.0 \
libkinolegacy.so.0 \
smilutils"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libdv.so.4 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libquicktime.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
