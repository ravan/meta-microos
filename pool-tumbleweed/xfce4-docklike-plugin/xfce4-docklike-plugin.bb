SUMMARY = "Docklike Taskbar"
DESCRIPTION = "Docklike Taskbar behaves similarly to many other desktop environments \
and operating systems. Wherein all application windows are grouped \
together as an icon and can be pinned to act as a launcher when the \
application is not running. Commonly referred to as a dock."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "xfce4-docklike-plugin-0.5.1-1.2.aarch64.rpm"
RPM_HASH = "478c4ee9c1f227cd96be696eff7276c8ea8936f73555069631d7c19ae155f7b55fda62d068d96b064b98bbeef4b1456b48d4bd504e40e3aba5df3d0401484cf0"

RPROVIDES:${PN} += "libdocklike.so \
xfce4-docklike-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfce4windowing-0.so.0 \
libxfce4windowingui-0.so.0 \
xfce4-panel"

inherit rpm
