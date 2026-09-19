SUMMARY = "CPU Graph Plugin for the Xfce Panel"
DESCRIPTION = "The CPU Graph plugin diplays a customizable graph of the CPU load of either \
a specific CPU or all CPUs combined."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "xfce4-cpugraph-plugin-1.3.0-1.4.aarch64.rpm"
RPM_HASH = "2ae22a836a805ea9f3bd76f4533d65d05a6d2ab09bbbf0c5f1c679d08c1ea518911a3829c5bed5557b5ff8af2ba6805ac3cfcb4c15e16beb496b17faa7ecdb7e"

RPROVIDES:${PN} += "libcpugraph.so \
xfce4-cpugraph-plugin \
xfce4-panel-plugin-cpugraph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
