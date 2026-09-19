SUMMARY = "X Window System initializer"
DESCRIPTION = "The xinit program is used to start the X Window System server and a \
first client program on systems that are not using a display manager \
such as xdm or in environments that use multiple window systems. \
When this first client exits, xinit will kill the X server and then \
terminate."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "xinit-1.4.4-1.5.aarch64.rpm"
RPM_HASH = "aa2220fa85455ed8cb5be72084000d2b5aab8c9eb5afcffb4dbd1380c962df044dd790775f265412a60b821cd398b7c19d80aa2ac866ff95f8e7045a3e3d85cc"

RPROVIDES:${PN} += "config-xinit \
xinit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
setxkbmap \
xauth \
xmodmap \
xrdb \
xsetroot \
xterm-bin"

inherit rpm
