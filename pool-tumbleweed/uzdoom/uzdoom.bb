SUMMARY = "A DOOM source port with graphic and modding extensions"
DESCRIPTION = "UZDoom is a port (a modification) of the original Doom source code, \
featuring: \
 \
* an OpenGL renderer, HQnX/xBRZ rescaling, 3D floor and model support \
* Truecolor software rendering, extending the classic 8-bit palette \
* Heretic, Hexen and Strife game modes and support for a lot of \
  additional IWADs. \
* Boom and Hexen map extension support, scriptability with ACS and \
  ZScript, and various modding features regarding actors and scenery. \
* Demo record/playback of classic and Boom demos is not supported."
LICENSE = "GPL-3.0-only"

PV = "4.14.3"

RPM_NAME = "uzdoom-4.14.3-2.5.aarch64.rpm"
RPM_HASH = "431c6ade7f5f174d977543e2370d568202ca92534da9cc13308625f844a95349a494ad0d5e9d771ec8a8c00ff960dc04fdbaa73caa4a33ea1815822e32a33f37"

RPROVIDES:${PN} += "bundled-gdtoa \
bundled-glslang \
bundled-re2c \
bundled-vulkan \
bundled-vulkan-volk \
bundled-xbrz \
qzdoom \
uzdoom \
zdoom"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libdiscord-rpc.so.3.4.0 \
libgcc-s.so.1 \
libgomp.so.1 \
liblzmasdk.so.26 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvpx.so.12 \
libz.so.1 \
libzmusic.so.1"

inherit rpm
