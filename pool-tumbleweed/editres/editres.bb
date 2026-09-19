SUMMARY = "Dynamic resource editor for X Toolkit applications"
DESCRIPTION = "Editres is a tool that allows users and application developers to view \
the full widget hierarchy of any X Toolkit application that speaks the \
Editres protocol."
LICENSE = "X11"

PV = "1.1.1"

RPM_NAME = "editres-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "a987f255018a3d449f891fa29c50414c0c72500f23e85ca7de40efbe24a0ffb74d4b3ac4328e065f1ccd45a51563cdbaf0bafc03db98e97d19aa7ec5cf403ef2"

RPROVIDES:${PN} += "editres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
