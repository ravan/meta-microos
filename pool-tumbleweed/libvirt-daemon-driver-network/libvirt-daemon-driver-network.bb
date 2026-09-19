SUMMARY = "Network daemon and driver plugin"
DESCRIPTION = "The network daemon and driver plugin, providing an implementation of the \
virtual network APIs using the Linux bridge capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-network-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "3de09f84cda2b0902dd9a89195c483ccb81e038051c9aae61775fb6f77a61ae6c46b64da5503704336d7bb26d174fc81876b554a4433c8624987f4462a1d3bea"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-network \
libvirt-daemon-driver-network \
libvirt-driver-network.so"

RDEPENDS:${PN} += "/usr/bin/sh \
dnsmasq \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
nftables"

inherit rpm
