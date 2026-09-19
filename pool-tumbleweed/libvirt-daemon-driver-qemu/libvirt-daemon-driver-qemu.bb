SUMMARY = "Qemu daemon and driver plugin"
DESCRIPTION = "The qemu daemon and driver plugin, providing an implementation of the \
hypervisor driver APIs using QEMU."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-qemu-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "62f9a89145b3339c44a5ffb1b56b6766a94e8bf588f3683c992ae28f41cfdd031b754044c55f7a1702f7a265f5fc34baf588ca25977094e9d427927d7dab9705"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-qemu \
libvirt-daemon-driver-qemu \
libvirt-driver-qemu.so"

RDEPENDS:${PN} += "/usr/bin/bzip2 \
/usr/bin/gzip \
/usr/bin/lzop \
/usr/bin/qemu-img \
/usr/bin/sh \
/usr/bin/xz \
/usr/bin/zstd \
group-qemu \
group-tss \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libselinux.so.1 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-log \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.16 \
qemu \
qemu-uefi-aarch64 \
swtpm \
systemd-container \
user-qemu \
user-tss"

inherit rpm
