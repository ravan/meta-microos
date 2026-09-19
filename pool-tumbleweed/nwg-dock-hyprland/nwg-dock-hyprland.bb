SUMMARY = "Hyprland application dock"
DESCRIPTION = "Configurable (w/ command line arguments and css) dock, written in Go, aimed \
exclusively at the Hyprland Wayland compositor. It features pinned buttons, \
client buttons and the launcher button."
LICENSE = "MIT"

PV = "0.4.10"

RPM_NAME = "nwg-dock-hyprland-0.4.10-1.4.aarch64.rpm"
RPM_HASH = "3d2188b42a6413777d72362d85045a69489ba82444a52f3ad9f321d43835a5339d822dc4f4f2d21e7ea4b4acfd06705cd776d4af69b98edb3399120f116ec4b3"

RPROVIDES:${PN} += "nwg-dock-hyprland"

RDEPENDS:${PN} += "libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0"

inherit rpm
