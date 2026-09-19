SUMMARY = "Plugins for Avogadro2libs"
DESCRIPTION = "This package contains the vendor provided plugins for Avogadro2"
LICENSE = "Apache-2.0 & BSD-3-Clause & CDDL-1.0 & GPL-3.0-or-later"

PV = "1.100.0"

RPM_NAME = "avogadrolibs-plugins-1.100.0-3.6.aarch64.rpm"
RPM_HASH = "245115a390dc7c30be9986174a7a52cf4f0bfcd5f4e8ca52e31de588283b17ec794954e79f3623312401c57f969b98359edc5ef2179d750db48d9f098af5bba9"

RPROVIDES:${PN} += "avogadrolibs-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAvogadroCalc.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroMoleQueue.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQuantumIO.so.1 \
libAvogadroRendering.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
