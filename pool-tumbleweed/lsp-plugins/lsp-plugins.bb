SUMMARY = "Linux Studio Plugins Project (Stand-alone)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "lsp-plugins-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "6167ebb33f68832ea6e0d515865c3ac8b238a8260a293ae4a2aafd45bb5120ef77e4cd236c58ac5f8b4a9795104de7f43f4ab534cc19f086a63597e6c4eda552"

RPROVIDES:${PN} += "liblsp-audio-jack-lib-1.0.1.so \
liblsp-plugins-standalone-1.2.34.so \
lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm
