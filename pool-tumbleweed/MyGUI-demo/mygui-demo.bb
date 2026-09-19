SUMMARY = "Some demo applications for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains some demo applications for package MyGUI."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "MyGUI-demo-3.4.3-2.8.aarch64.rpm"
RPM_HASH = "cb33565b8957081f9cba8f83385cc30bb266483e01dcaa78f7b5fff60574482862e79ea6c24ed872b366b280c237ffcefb14016ef2e2b0f4ab8a272b8259495c"

RPROVIDES:${PN} += "MyGUI-demo"

RDEPENDS:${PN} += "MyGUI \
ld-linux-aarch64.so.1 \
libMyGUI.OgrePlatform.so \
libMyGUICommon.so.3.4.3 \
libMyGUIEngine.so.3.4.3 \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
