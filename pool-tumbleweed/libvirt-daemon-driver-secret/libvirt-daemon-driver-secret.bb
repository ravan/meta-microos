SUMMARY = "Secret daemon and driver plugin"
DESCRIPTION = "The secret daemon and driver plugin, providing an implementation of the \
secret key APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-secret-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "085f8a709980e905df826b14ca86df4c57ba6e07581f373a599e6bb0e9356e392048972304c43da2c604cd1421e35a81ef0ce8f8d25e0eb15037d4cb7925afae"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-secret \
libvirt-daemon-driver-secret \
libvirt-driver-secret.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
