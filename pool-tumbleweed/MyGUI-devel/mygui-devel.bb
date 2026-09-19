SUMMARY = "Development files for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of MyGUI."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "MyGUI-devel-3.4.3-2.8.aarch64.rpm"
RPM_HASH = "31b6c7a6f2cdb80ea22f83aeb2c947a9023a363393950e0215d3d51ce53803580e178098a77fe67617768dca77bbc0950ed0652cb0393dd7b230529563f3fe69"

RPROVIDES:${PN} += "MyGUI-devel \
libEditorFramework.so \
libMyGUI.OgrePlatform.so \
pkgconfig-MYGUI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
MyGUI \
ld-linux-aarch64.so.1 \
libMyGUICommon3-4-3 \
libMyGUIEngine.so.3.4.3 \
libMyGUIEngine3-4-3 \
libOIS-devel \
libOgreMain-devel \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
pkgconfig \
pkgconfig-freetype2 \
pkgconfig-uuid"

inherit rpm
