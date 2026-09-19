SUMMARY = "Linux Studio Plugins (CLAP)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the CLAP version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "clap-lsp-plugins-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "49baec1b228d586163bcbb46e2a6bbda99598d472ed281c8766ee69adf32c8e2f0cd161303999ac39c5cf9f7c13891018ba0cd55b6cd84169c14494cd361799d"

RPROVIDES:${PN} += "clap-lsp-plugins"

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
