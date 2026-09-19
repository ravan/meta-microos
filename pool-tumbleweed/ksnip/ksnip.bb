SUMMARY = "Screenshot tool"
DESCRIPTION = "Ksnip is a Qt based cross-platform screenshot tool that provides many \
annotation features for your screenshots."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "ksnip-1.10.1-3.7.aarch64.rpm"
RPM_HASH = "e615b3f655c53f2baf652b3184297dc2a2d8439bf569d0dfab76e2f180d7672993be5004ab303e21e30a6c49ca46cba2bae7a584716de2463124111e3991eaa7"

RPROVIDES:${PN} += "ksnip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkImageAnnotator-Qt6.so.0 \
libstdc++.so.6 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
