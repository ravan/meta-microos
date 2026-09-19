SUMMARY = "Visualization tools for the Performance Co-Pilot toolkit"
DESCRIPTION = "Visualization tools for the Performance Co-Pilot toolkit. \
The pcp-gui package primarily includes visualization tools for \
monitoring systems using live and archived Performance Co-Pilot \
(PCP) sources."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-gui-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "570f7945a7ca8454846622804fa6a4e87c1fd1cbd42858ac8e6fdd55cb7a830692aaf9e92f9129b767ffe1a321cdf541aad6a024a40117856ed3817558d9dead"

RPROVIDES:${PN} += "config-pcp-gui \
pcp-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
dejavu-fonts \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcp.so.3 \
libstdc++.so.6"

inherit rpm
