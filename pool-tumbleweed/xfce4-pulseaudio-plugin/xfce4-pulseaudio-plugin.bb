SUMMARY = "Pulseaudio Volume Control Plugin for the Xfce Panel"
DESCRIPTION = "Xfce4-pulseaudio-plugin is a panel plugin for controlling an audio \
output volume of the PulseAudio mixer. The volume can be adjusted using \
keyboard shortcuts, mouse wheel, a slider in a popup menu, or via \
a linked external audio mixer tool."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "xfce4-pulseaudio-plugin-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "813d647a07a05795a7f659ff8e7788f3905cfd1409130a8c6817b1957990a53cc0028fb4a8ec095de683bd5698c51a3da78037bcefe391979ef134ba30d8a752"

RPROVIDES:${PN} += "libpulseaudio-plugin.so \
xfce4-panel-plugin-pulseaudio \
xfce4-pulseaudio-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libnotify.so.4 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfce4windowing-0.so.0 \
libxfconf-0.so.3 \
pulseaudio-daemon \
xfce4-panel"

inherit rpm
