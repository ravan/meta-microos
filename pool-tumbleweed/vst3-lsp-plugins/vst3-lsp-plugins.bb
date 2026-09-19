SUMMARY = "Linux Studio Plugins (VST3)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the VST3 version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "vst3-lsp-plugins-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "9b12af3b5a21c6184a3a36ead7f53325ce1f040cb3ae01c8470332f74843798e05bb2a7704ce24f4d014319e87a4a82b1bc8362908d5f9b146c777ed82207f4a"

RPROVIDES:${PN} += "vst3-lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm
