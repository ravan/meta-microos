SUMMARY = "A GUI library for Ogre Rendering Engine"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
MyGUI has overlays for text and for simple rectangles, allowing \
uniting them in one batch. \
 \
The library supports plugins that allow you to create \
dynamically-loaded custom controls or subsystems. Most subsystems are \
expandable with plugins without the need to touch the core code. All \
resources and settings are described in XML files. It is possible to \
load resources like fonts, cursors, images, skins, etc. Forms \
(layouts) via dynamically by using XML files. \
 \
This package contains ImageSetViewer and LayoutEditor."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "MyGUI-3.4.3-2.8.aarch64.rpm"
RPM_HASH = "b5f2c992fade5cb8f9655da17d440b61d600b3507022c0d767850cd5bd166e528bc1f5cb47e6b08a5d539ed71bf561511ef0bb9302e2ed2d3e847fafb4da0d93"

RPROVIDES:${PN} += "MyGUI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMyGUIEngine.so.3.4.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
