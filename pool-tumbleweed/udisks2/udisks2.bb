SUMMARY = "Disk Manager"
DESCRIPTION = "The Udisks project provides a daemon, tools and libraries to access and \
manipulate disks, storage devices and technologies."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.11.2"

RPM_NAME = "udisks2-2.11.2-1.1.aarch64.rpm"
RPM_HASH = "21548c2a062ab99fca9e332ded91c8b16aa456402aa7945e7757f5a63d2ad890e6f64380e75bc8f601d293ffe00e3a965b632a2dd1f6063b06d7bb66f9757aa5"

RPROVIDES:${PN} += "config-udisks2 \
udisks2"

RDEPENDS:${PN} += "/usr/bin/sh \
cryptsetup \
dbus-service \
dosfstools \
e2fsprogs \
eject \
gptfdisk \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libatasmart-utils \
libbd-utils.so.3 \
libblkid.so.1 \
libblockdev \
libblockdev-crypto \
libblockdev-fs \
libblockdev-loop \
libblockdev-mdraid \
libblockdev-nvme \
libblockdev-part \
libblockdev-smart \
libblockdev-swap \
libblockdev.so.3 \
libc.so.6 \
libeconf.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmount.so.1 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libudisks2-0 \
libudisks2.so.0 \
libuuid.so.1 \
udev \
util-linux \
xfsprogs"

inherit rpm
