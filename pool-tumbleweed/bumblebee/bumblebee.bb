SUMMARY = "NVidia Optimus support for GNU/Linux aimed at stability"
DESCRIPTION = "The Bumblebee daemon is a rewrite of the original Bumblebee service, \
providing a means of managing Optimus hybrid graphics chipsets. This \
project not only enables use of the discrete GPU for rendering, but \
also smart power management of the dGPU when it is not in use."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "bumblebee-3.2.1-14.24.aarch64.rpm"
RPM_HASH = "00a14c21e401c7ef6f7127b329218b1030e2653923ac52a897061818417c2c40e5caed322c3125c1db6b499b0422b7dd88e9bdffcdcc114f4cf11b06ee4d06e5"

RPROVIDES:${PN} += "bumblebee \
config-bumblebee"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
VirtualGL \
kmod-compat \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
pciutils \
primus \
shadow \
sudo \
systemd \
xorg-x11-libX11"

inherit rpm
