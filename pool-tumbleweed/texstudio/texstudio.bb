SUMMARY = "LaTeX Editor"
DESCRIPTION = "TeXstudio is a program based on texmaker, that integrates many tools needed \
to develop documents with LaTeX, in just one application. Using its editor \
you can write your documents with the help of interactive spell checking, \
syntax highlighting, automatically code completion and more."
LICENSE = "Apache-2.0 & GPL-2.0-only & GPL-3.0-only & MPL-1.1"

PV = "4.9.8"

RPM_NAME = "texstudio-4.9.8-1.1.aarch64.rpm"
RPM_HASH = "897e8fbf0fa7b88f75afd8614cf4754c6c8c92d085bcef0d8022f21b8836de936d8e738289931a43cca7ea2354e7f934c80c1aaabd7fa917a39dec738b88ce05"

RPROVIDES:${PN} += "texstudio"

RDEPENDS:${PN} += "hunspell \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt6.so.3 \
libquazip1-qt6.so.1.7 \
libstdc++.so.6 \
libz.so.1 \
texlive-latex"

inherit rpm
