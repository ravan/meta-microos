SUMMARY = "GUI tools for mozc"
DESCRIPTION = "This package provides config, word-register, dictioaly, \
character-palette tools."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain & Zlib"

PV = "3.33.6133.102"

RPM_NAME = "mozc-gui-tools-3.33.6133.102-2.2.aarch64.rpm"
RPM_HASH = "1f03db051c40c1b0c28c2ea099f8cdd9feb72916312f9fd6bee06e6dc9c9cc1ae1ad5667a3ab44f893cd97788b4a3f48e4c918156a1d5613f44219f2ab5d2c71"

RPROVIDES:${PN} += "mozc-gui-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
mozc"

inherit rpm
