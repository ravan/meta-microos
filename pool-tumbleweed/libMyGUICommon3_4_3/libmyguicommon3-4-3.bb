SUMMARY = "Shared library for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains the shared library used by most MyGUI tools and demos."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "libMyGUICommon3_4_3-3.4.3-2.8.aarch64.rpm"
RPM_HASH = "b49ed3cf6f2275f14ec9ec35a9b0c1b6bd0a6c6adb44832d6b5f5ebbbea60b9cf6be64db0d867ec709e6cad4f3d1756ecb27a2ed802e92102c32c5d9619db079"

RPROVIDES:${PN} += "libMyGUICommon.so.3.4.3 \
libMyGUICommon3-4-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMyGUI.OgrePlatform.so \
libMyGUIEngine.so.3.4.3 \
libOgreMain.so.13.6 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
