SUMMARY = "Linux Studio Plugins (LV2)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform. \
 \
This is the LV2 version of the plugins."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "lv2-lsp-plugins-1.2.34-1.1.aarch64.rpm"
RPM_HASH = "860daeab741b7f8fde726ded9d2a7cd4c46171291fb58a96c8b0b524dc18d1969653d7b4d086ed4767f630d141bdda8a7ed9e3853cf39781a1cf7fbf6d055e6a"

RPROVIDES:${PN} += "lv2-lsp-plugins"

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
