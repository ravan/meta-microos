SUMMARY = "MPD Client for the Xfce Desktop Environment"
DESCRIPTION = "Xfmpc is a Music Player Daemon (MPD) client application for the \
Xfce desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "xfmpc-0.4.0-1.6.aarch64.rpm"
RPM_HASH = "f76833b652995be7503c3818c1bd75573626de01614c793697305303e09f46fddf53f95ba0a75342a12b3853e1b4baff0636e844e36c789a6e736a4b4a52b265"

RPROVIDES:${PN} += "xfmpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmpd.so.1 \
libpango-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
