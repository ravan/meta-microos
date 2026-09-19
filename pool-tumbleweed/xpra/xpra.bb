SUMMARY = "Remote display server for applications and desktops"
DESCRIPTION = "Xpra is 'screen for X': it allows you to run X programs, usually on a remote \
host, direct their display to your local machine, and then to disconnect from \
these programs and reconnect from the same or another machine, without losing \
any state. It gives you remote access to individual applications. \
 \
Xpra is 'rootless' or 'seamless': programs you run under it show up on your \
desktop as regular programs, managed by your regular window manager. \
Sessions can be accessed over SSH, or password protected over plain TCP sockets. \
Xpra is usable over reasonably slow links and does its best to adapt to changing \
network bandwidth constraints."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-3.0-or-later & MIT"

PV = "6.5.3"

RPM_NAME = "xpra-6.5.3-1.1.aarch64.rpm"
RPM_HASH = "2ef7f90bde2034c5889e022125cfe5085f82c498de676e14650403b6316343597a3ad2e246ebbf33369a6ad70aed7ca1b2f24a1d81c9e9751106ad8b35a13aae"

RPROVIDES:${PN} += "config-xpra \
group-xpra \
python3.13dist-xpra \
python3dist-xpra \
xpra"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/dbus-launch \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-utils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXrandr.so.2 \
libXtst.so.6 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblz4.so.1 \
libpam-misc.so.0 \
libpam.so.0 \
libproc2.so.1 \
libqrencode.so.4 \
libsystemd.so.0 \
libvpx.so.12 \
libwayland-client.so.0 \
libwebp.so.7 \
libxkbfile.so.1 \
libxxhash.so.0 \
pulseaudio-daemon \
pulseaudio-utils \
python-abi \
python313-Pillow \
python313-cairo \
python313-dbus-python \
python313-gobject \
python313-gobject-Gdk \
python313-gst \
python313-pycups \
python313-rencode \
shared-mime-info \
typelib-1-0-Notify-0-7 \
typelib-Gdk \
typelib-Gio \
xf86-video-dummy \
xorg-x11-xauth"

inherit rpm
