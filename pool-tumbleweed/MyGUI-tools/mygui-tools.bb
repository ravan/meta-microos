SUMMARY = "Tools applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains tools applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "MyGUI-tools-3.4.3-2.8.aarch64.rpm"
RPM_HASH = "9d0a86b95bc18886b7ff9ebdeea2a50785fb6cff1bbff46ab2a0aef375b5632111379f4af8fcdf86508b4445320a3df30db2dc04314bd43ead0c6f4673fc76d3"

RPROVIDES:${PN} += "MyGUI-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
MyGUI \
ld-linux-aarch64.so.1 \
libEditorFramework.so \
libMyGUICommon.so.3.4.3 \
libMyGUIEngine.so.3.4.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
