SUMMARY = "Linux Studio Plugins (LADSPA)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LADSPA version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "ladspa-lsp-plugins-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "ad17f8f603474fe05ef1ac4b76b485810838dffdab25708789b744ffb5031cdaccc5bad7f5e1c8ea9d531b0ad70fcbd1c646a550dd4a7fab7701f4e824392727"

RPROVIDES:${PN} += "ladspa-lsp-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6 \
lsp-plugins-common"

inherit rpm
