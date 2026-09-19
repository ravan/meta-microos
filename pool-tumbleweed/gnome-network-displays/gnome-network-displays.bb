SUMMARY = "Miracast implementation for GNOME"
DESCRIPTION = "This is an experimental implementation of Wi-Fi Display (aka Miracast). \
 \
The application will stream the selected monitor if the mutter screencast \
portal is available. If it is unavailable, a fallback to X11 based frame \
grabbing will happen. As such, it should work fine in almost all setups. \
 \
To get audio streaming, you need to change the audio output in pulseaudio \
to use the created 'Network-Displays' sink."
LICENSE = "GPL-3.0-or-later"

PV = "0.99.0"

RPM_NAME = "gnome-network-displays-0.99.0-2.3.aarch64.rpm"
RPM_HASH = "699fe67ec141bdc049b0b6fed5f9dafa4803782a76127a2de4e09545e7626250648bb2605258fb8f6dfbc6be7ec2b39d951d2ab6d9f8bda6d258fa220df076cb"

RPROVIDES:${PN} += "gnome-network-displays"

RDEPENDS:${PN} += "gstreamer-plugin-pipewire \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libavahi-common.so.3 \
libavahi-gobject.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstrtspserver-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libnm.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libprotobuf-c.so.1 \
libpulse.so.0 \
libsoup-3.0.so.0"

inherit rpm
