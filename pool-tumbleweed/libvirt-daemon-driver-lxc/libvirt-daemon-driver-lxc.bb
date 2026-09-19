SUMMARY = "LXC daemon and driver plugin"
DESCRIPTION = "The LXC daemon and driver plugin, providing an implementation of the \
hypervisor driver APIs using the Linux kernel"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-lxc-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "ca950367b0800c304c6f96bfdf92f10cbcfab4862bc5eb555f46698dc9c8876518b16d6943f4d857328944bcbe181db672fe2a54291567a7478233d637b91ca7"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-lxc \
libvirt-daemon-driver-lxc \
libvirt-driver-lxc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libfuse3.so.4 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-driver-network \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
modutils \
systemd-container"

inherit rpm
