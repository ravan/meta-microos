SUMMARY = "Daemon for 3Dconnexion devices"
DESCRIPTION = "Spacenavd is a free software replacement user-space driver (daemon) \
for 3Dconnexion's 6-degree-of-freedoms input devices. It is \
compatible with the original 3dxsrv daemon, and works perfectly with \
any program that was written for the 3Dconnexion driver."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "spacenavd-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "6e95b90f98cf5867e1c51be9d40967c9cc55baad40569715b3e366808484cd17a767fbd7317e5d51cebe45d1155620e0eef6bde2c4d8eb89b9312e4ee1a92a52"

RPROVIDES:${PN} += "config-spacenavd \
spacenavd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
systemd \
xdpyinfo"

inherit rpm
