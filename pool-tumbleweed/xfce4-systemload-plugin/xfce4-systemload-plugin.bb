SUMMARY = "System Load Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Systemload plugin can display the current CPU load, used memory and swap \
space as well as the system uptime in the panel."
LICENSE = "BSD-2-Clause"

PV = "1.4.0"

RPM_NAME = "xfce4-systemload-plugin-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "6bc62ebc2a364090f568d8d4ab31f3e9d135a6eca02d92bae81c8c4477c747dcc6dbc27a0e0a97c2534e1313a9b974826a596e767718fb73cb8908f9cfeac0b0"

RPROVIDES:${PN} += "libsystemload.so \
xfce4-panel-plugin-systemload \
xfce4-systemload-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libupower-glib.so.3 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
