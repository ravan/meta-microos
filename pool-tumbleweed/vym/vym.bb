SUMMARY = "Tool to generate and manipulate thought maps"
DESCRIPTION = "VYM (View Your Mind) is a tool to generate and manipulate maps which \
show thoughts. Such maps can help improve creativity and effectivity. \
They can be used for time management, to organize tasks, to get an \
overview over complex contexts, to sort ideas etc."
LICENSE = "GPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "vym-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "4a2e45b96b8e744dc8834e83f9011626a1f5e240cfb17e64816548605b0b871c02e12d7e1c03ea34c403f0f835f6960deffcbf1742910d25626c584ff03a9f78"

RPROVIDES:${PN} += "vym"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Svg.so.6 \
libQt6Svg6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
unzip \
zip"

inherit rpm
