SUMMARY = "Adjusts the color temperature of your screen according to time of day"
DESCRIPTION = "Gammastep adjusts the color temperature of your screen according to your \
surroundings. This may help your eyes hurt less if you are working in front \
of the screen at night. \
 \
The color temperature is set according to the position of the sun. A different \
color temperature is set during night and daytime. During twilight and early \
morning, the color temperature transitions smoothly from night to daytime \
temperature to allow your eyes to slowly adapt. \
 \
Gammastep supports wlr-gamma-control-unstable-v1 protocol for wlroots-based \
wayland compositors."
LICENSE = "0BSD & GPL-3.0-or-later & MIT"

PV = "2.0.11"

RPM_NAME = "gammastep-2.0.11-1.6.aarch64.rpm"
RPM_HASH = "9de7ee9395357ab3beb009e3f903cd2fdd16c8ae87a3feafbbac28e3154c1a58ca203e847399efde7eb3c946d7e078809df5fca569f4e09dec1b3939baa2ae2e"

RPROVIDES:${PN} += "gammastep"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libdrm.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libwayland-client.so.0 \
libxcb-randr.so.0 \
libxcb.so.1"

inherit rpm
