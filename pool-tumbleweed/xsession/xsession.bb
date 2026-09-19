SUMMARY = "A session manager"
DESCRIPTION = "The xsession program is a session manager.  It is normally executed by \
your ~/.xinitrc (or ~/.xsession) script and controls your X Window \
session.  As soon as it is started, xsession launches a window manager \
and some applications of your choice.  At anytime during your session, \
you may switch to another window manager or execute some other \
applications from the xsession menus. \
 \
Examples may be found under /usr/share/doc/packages/xsession/examples."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "xsession-1.1-1250.5.aarch64.rpm"
RPM_HASH = "11c5c3b20e692190798625c8874e8ca76afdfb9fd3133ec0844dcd48e4d2a5c718a188ea3bba168e277d56d6ad6ff4a8b9294033ddec232784f0f90d9611df95"

RPROVIDES:${PN} += "config-xsession \
xsession"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
