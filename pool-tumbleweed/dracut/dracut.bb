SUMMARY = "Event driven initramfs infrastructure"
DESCRIPTION = "Dracut contains tools to create a bootable initramfs for Linux kernels >= 2.6. \
Dracut contains various modules which are driven by the event-based udev \
and systemd. Having root on MD, DM, LVM2, LUKS is supported as well as \
NFS, iSCSI, NBD, FCoE."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "112+suse.51.gf078a84"

RPM_NAME = "dracut-112+suse.51.gf078a84-1.1.aarch64.rpm"
RPM_HASH = "4d7bd7a8b122b70595aa40b5a76485493988d1dad224aa0d41c3a9457f68e7d2c84074c02a0532dbae368abd9c8a111e5a66fe89d0d3b9f5734d6bb33adce844"

RPROVIDES:${PN} += "config-dracut \
dracut \
pkgconfig-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/get-kernel-version \
/usr/bin/pkg-config \
/usr/bin/sh \
bash \
coreutils \
cpio \
elfutils \
file \
filesystem \
findutils \
gawk \
grep \
hardlink \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkmod.so.2 \
libsystemd.so.0 \
modutils \
pigz \
sed \
systemd \
udev \
util-linux \
util-linux-systemd \
zstd"

inherit rpm
