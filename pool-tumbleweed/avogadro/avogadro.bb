SUMMARY = "A Molecular design tool"
DESCRIPTION = "Avogadro is an advanced molecular editor designed \
for cross-platform use in computational chemistry, \
molecular modeling, bioinformatics, materials science, \
and related areas. It offers flexible rendering and \
a powerful plugin architecture."
LICENSE = "GPL-2.0-only"

PV = "1.100.0"

RPM_NAME = "avogadro-1.100.0-1.7.aarch64.rpm"
RPM_HASH = "a29d0df213ecab93f54c342fc0e8c86c4504cc6c709d5b2d672b6e94b1fece04c4c50dc7a8f52e38e591f33f608072c8ce094c4a960f643df7a4b7584653e1c1"

RPROVIDES:${PN} += "avogadro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQtPlugins.so.1 \
libAvogadroRendering.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
