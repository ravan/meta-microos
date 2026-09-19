SUMMARY = "Nodedev daemon and driver plugin"
DESCRIPTION = "The nodedev daemon and driver plugin, providing an implementation of the \
node device APIs using the udev capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-nodedev-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "f7a7d644762dc1dc8e415e45ba5fb22b7739647d5b0894025813514d9b2c471bc3a0da9d3b92fbc07cab51853bd98ad72b1b033dacd61eb1feaa2e66ce8e621e"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-nodedev \
libvirt-daemon-driver-nodedev \
libvirt-driver-nodedev.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpciaccess.so.0 \
libtirpc.so.3 \
libudev.so.1 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
mdevctl \
modutils"

inherit rpm
