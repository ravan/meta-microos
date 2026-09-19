SUMMARY = "VNC Tools based on gtk-vnc"
DESCRIPTION = "This package contains tools based on gtk-vnc: \
 \
 - gvnccapture: a tool to capture a screenshot of the VNC desktop \
 \
 - gvncviewer: a simple VNC client"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "gtk-vnc-tools-1.5.0-5.2.aarch64.rpm"
RPM_HASH = "0d1c7a1d52cf91e1e85bb87f30443399800c3ffcb4314c993b16e595efe8d6cc58b1928b2e38b8cced3f150dcb9bfea0974c198507946168c5fca3a9bc4d0304"

RPROVIDES:${PN} += "gtk-vnc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0"

inherit rpm
