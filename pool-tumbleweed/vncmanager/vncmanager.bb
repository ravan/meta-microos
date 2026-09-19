SUMMARY = "Session manager for VNC"
DESCRIPTION = "Session manager for VNC. It listens on VNC port and spawns Xvnc processes for incoming clients."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-1.0.2-13.9.aarch64.rpm"
RPM_HASH = "dade5b443e626d0d83bb2335d22646e55c73c5ac928a83144b35659835521e3e2fba99eef649a33b79b9226df21ec598348ce22ca07d25a8979bbb183ccffbae"

RPROVIDES:${PN} += "vncmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
group-vnc \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libstdc++.so.6 \
user-vnc \
vncmanager-greeter \
xorg-x11-Xvnc \
xorg-x11-Xvnc-/usr/lib/vnc/with-vnc-key.sh"

inherit rpm
