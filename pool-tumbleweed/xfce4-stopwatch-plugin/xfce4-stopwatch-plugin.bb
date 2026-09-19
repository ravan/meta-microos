SUMMARY = "A panel plugin to keep track of elapsed time"
DESCRIPTION = "A panel plugin to keep track of elapsed time"
LICENSE = "BSD-2-Clause"

PV = "0.6.0"

RPM_NAME = "xfce4-stopwatch-plugin-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "401e92de35ed32356ffd879fb4da3dddad6457a1fc1154b322724da15aa553fb391d231d2c540da30a514ea2ea1c35c0c76e6c49af7cc957cffd8cceff6cc17d"

RPROVIDES:${PN} += "libstopwatch.so \
xfce4-panel-plugin-stopwatch \
xfce4-stopwatch-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
