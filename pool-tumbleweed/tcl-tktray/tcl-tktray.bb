SUMMARY = "System Tray Icon Support for Tk on X11"
DESCRIPTION = "Tktray is a Tk extension that is able to create system tray icons. It \
follows http://www.freedesktop.org specifications when looking up the system \
tray manager.  This protocol is supported by modern versions of KDE and \
Gnome panels, and by some other panel-like application."
LICENSE = "TCL"

PV = "1.3.9"

RPM_NAME = "tcl-tktray-1.3.9-8.38.aarch64.rpm"
RPM_HASH = "542174fb4e46e16dd64d2bb663da0b7bd78cb1611a393c97718d83e6934c90b8afc2aa791747f0eba86508474d4ddc3c55df64edcbf581af8ee7afed367208bd"

RPROVIDES:${PN} += "libtktray1.3.9.so \
tcl-tktray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
tcl \
tk"

inherit rpm
