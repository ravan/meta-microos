SUMMARY = "Customizable Wayland bar for Sway and Wlroots based compositors"
DESCRIPTION = "A customizable Wayland bar for Sway and Wlroots based compositors. \
It comes with modules for pipewire, alsa, backlight, and bluetooth. \
Other modules can be found in the manpages of Waybar."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "waybar-0.15.0-1.8.aarch64.rpm"
RPM_HASH = "4d089135c917af03f7ca064682fc629a130dd86f7094cd5fbd8f13b25fe512b985e88c8eb4cd2ca2aa827b133db0ead78a942e92e774f4e45763d6213213c597"

RPROVIDES:${PN} += "waybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libdbusmenu-gtk3.so.4 \
libevdev.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgps.so.32 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libgtkmm-3.0.so.1 \
libinput.so.10 \
libjack.so.0 \
libjsoncpp.so.27 \
libm.so.6 \
libmpdclient.so.2 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpipewire-0.3.so.0 \
libplayerctl.so.2 \
libpulse.so.0 \
libsigc-2.0.so.0 \
libsndio.so.7 \
libspdlog.so.1.17 \
libstdc++.so.6 \
libudev.so.1 \
libupower-glib.so.3 \
libwayland-client.so.0 \
libwireplumber-0.5.so.0 \
libxkbregistry.so.0 \
waybar-branding"

inherit rpm
