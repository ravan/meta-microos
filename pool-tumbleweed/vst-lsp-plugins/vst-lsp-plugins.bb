SUMMARY = "Linux Studio Plugins (VST)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the VST version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "vst-lsp-plugins-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "36c58ee9146e6b7159aa0e3baf34202ac3779ecdaefc3775ecee7c443c52a6f73a8787dd27960876dc117bc0d194663683e31f1d739f858c550c0d24d4e3bc31"

RPROVIDES:${PN} += "vst-lsp-plugins"

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
