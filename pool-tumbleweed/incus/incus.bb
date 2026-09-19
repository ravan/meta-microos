SUMMARY = "Container hypervisor based on LXC"
DESCRIPTION = "Incus is a system container manager. It offers a user experience \
similar to virtual machines but uses Linux containers (LXC) instead."
LICENSE = "Apache-2.0"

PV = "7.4"

RPM_NAME = "incus-7.4-1.1.aarch64.rpm"
RPM_HASH = "3987e67bed12058f1c9dd507d1e8dc86c07840990818deefc5174dcf4b0a0e15bdaa47f45ce564a29f32ac78f0dbf844d95478440583d5513ccd7ca94e49d753"

RPROVIDES:${PN} += "config-incus \
group-incus \
group-incus-admin \
incus"

RDEPENDS:${PN} += "/usr/bin/sh \
acl \
attr \
dnsmasq \
ebtables \
incus-cli \
kernel-base \
lego \
libacl.so.1 \
libc.so.6 \
libcap.so.2 \
libcowsql.so.0 \
libgcc-s.so.1 \
liblxc.so.1 \
libsqlite3.so.0 \
libudev.so.1 \
lxcfs \
lxcfs-hooks-lxc \
lxd-ovmf-setup-aarch64 \
qemu-arm \
qemu-chardev-spice \
qemu-hw-display-virtio-gpu \
qemu-hw-display-virtio-vga \
qemu-hw-usb-redirect \
qemu-img \
qemu-spice \
qemu-ui-spice-core \
rsync \
skopeo \
squashfs \
sysuser-shadow \
tar \
umoci \
virtiofsd \
xz"

inherit rpm
