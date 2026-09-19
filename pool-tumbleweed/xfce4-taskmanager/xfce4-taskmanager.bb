SUMMARY = "Simple Taskmanager for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-taskmanager is a simple taskmanager for the Xfce desktop environment. It \
can display window and icon names in a tree view, columns can be reordered, and \
CPU and memory usage are displayed as a graph."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "xfce4-taskmanager-1.6.0-1.5.aarch64.rpm"
RPM_HASH = "06dadbd8eaf0c18dc0bfa4f3e811db35b82687af70e8de7d8a2855742aaf19b546178b7d07c23698e6c2ce9cc64b8320088ec1fc552c07826ca1b4cd3426ac68"

RPROVIDES:${PN} += "xfce4-taskmanager"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
