SUMMARY = "An editor for DOOM maps and WAD/PK3 archives"
DESCRIPTION = "SLADE is an editor for Doom-engine based games and source \
ports. It has the ability to view, modify, and write many different \
game-specific formats, and even convert between some of them, or \
from/to other generic formats such as PNG."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.11"

RPM_NAME = "slade-3.2.11-1.6.aarch64.rpm"
RPM_HASH = "0b768e9cd3dae5be5ebf02e2b19ea9d6d874f4d582029b18f938c3f2d8c27af59617253f82ca7f63aec22f7400df586e7c7c580178559d1ce3832df3b0a43901"

RPROVIDES:${PN} += "bundled-dumb \
slade"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libbz2.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libfmt.so.12 \
libftgl.so.2 \
libgcc-s.so.1 \
liblzmasdk.so.26 \
libm.so.6 \
libmpg123.so.0 \
libpng16.so.16 \
libsfml-audio.so.3.0 \
libsfml-network.so.3.0 \
libsfml-system.so.3.0 \
libstdc++.so.6 \
libwebp.so.7 \
libwebpdecoder.so.3 \
libwebpdemux.so.2 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-propgrid-suse.so.16.0.0 \
libwx-gtk3u-stc-suse.so.16.0.0 \
libz.so.1"

inherit rpm
