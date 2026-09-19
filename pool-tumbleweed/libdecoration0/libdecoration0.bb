SUMMARY = "Compiz window decoration library"
DESCRIPTION = "The window decoration library is responsible for drawing the \
window borders and title bar of windows managed by Compiz. It is \
used by window decorators like gtk-window-decorator."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "libdecoration0-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "545ff80372d9981580181363623d8e578138fc29751cac2d78a5d92f6a6289afdb9602e1a929bf6c7b4b9babc7b5be914a070212c84a430807e79a3b6c867f1a"

RPROVIDES:${PN} += "libdecoration.so.0 \
libdecoration0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
