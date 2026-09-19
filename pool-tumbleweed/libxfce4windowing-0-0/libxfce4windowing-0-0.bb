SUMMARY = "X11/Wayland windowing utility library for Xfce"
DESCRIPTION = "Libxfce4windowing is an abstraction library that attempts to present windowing \
concepts (screens, toplevel windows, workspaces, etc.) in a \
windowing-system-independent manner."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "libxfce4windowing-0-0-4.20.7-1.1.aarch64.rpm"
RPM_HASH = "ed25ce91217d30d70b09d492e21b3864ebcc545779c2d8fea9d2ed99620b98a21bddba054ebfcdf50b45b87488f827276ad1f653605563420c137524ad854967"

RPROVIDES:${PN} += "libxfce4windowing \
libxfce4windowing-0-0 \
libxfce4windowing-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libdisplay-info.so.3 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0 \
libwnck-3.so.0"

inherit rpm
