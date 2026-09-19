SUMMARY = "Avogadro libraries for computational chemistry"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis \
and data processing useful in computational chemistry, molecular \
modeling, bioinformatics, materials science, and related areas."
LICENSE = "Apache-2.0 & BSD-3-Clause & CDDL-1.0 & GPL-3.0-or-later"

PV = "1.100.0"

RPM_NAME = "libAvogadro1-1.100.0-3.6.aarch64.rpm"
RPM_HASH = "2f3451f8328c6ba0f7859b4a255ac0576041b6dc8a4dcf0755d26cb3edef7f463775c0a1d797b0935dadd6f5aa95b57c4aef8a86ea6718a977865b129b14b972"

RPROVIDES:${PN} += "libAvogadro1 \
libAvogadroCalc.so.1 \
libAvogadroCore.so.1 \
libAvogadroIO.so.1 \
libAvogadroMoleQueue.so.1 \
libAvogadroQtGui.so.1 \
libAvogadroQtOpenGL.so.1 \
libAvogadroQtPlugins.so.1 \
libAvogadroQuantumIO.so.1 \
libAvogadroRendering.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLEW.so.2.3 \
libOpenGL.so.0 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libsymspg.so.2"

inherit rpm
