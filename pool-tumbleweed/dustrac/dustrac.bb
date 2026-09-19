SUMMARY = "Tile-based 2D Racing Game"
DESCRIPTION = "Dust Racing is a tile-based 2D racing game written with Qt (in C++) \
and OpenGL. Dust Racing comes with a Qt-based level editor for level \
creation. A separate engine, MiniCore, is used for physics modeling."
LICENSE = "GPL-3.0-only & CC-BY-SA-3.0"

PV = "2.2.0"

RPM_NAME = "dustrac-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "c329ffe0d2807d83a4bab04389f50c430d474415405f8f41f534ae832b10882ecfac385489d63e55c3c392f992eb40acf3bed8f169348dd394f4916f5256296e"

RPROVIDES:${PN} += "dustrac"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libOpenGL.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
