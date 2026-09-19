SUMMARY = "A High Level Programming Language"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
 \
This package contains the graphical user interface."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.0"

RPM_NAME = "octave-11.3.0-1.2.aarch64.rpm"
RPM_HASH = "22b533904ec028cfab58d26c3e67b3de5bb0d1b4d7fc449cac40565bb58952b15c74275202f0915c8e10a78fbd65e812d06770aaaa6a9dc12653ebe5391f3364"

RPROVIDES:${PN} += "liboctgui.so.14 \
octave \
octave-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboctave.so.13 \
liboctinterp.so.15 \
liboctmex.so.1 \
libqscintilla2-qt6.so.15 \
libstdc++.so.6 \
octave-cli \
qt6-sql-sqlite \
update-alternatives"

inherit rpm
