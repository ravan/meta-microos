SUMMARY = "Logical Volume Manager Tools"
DESCRIPTION = "Programs and man pages for configuring and using the LVM2 Logical \
Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38"

RPM_NAME = "lvm2-2.03.38-2.5.aarch64.rpm"
RPM_HASH = "eea813a86151f15ec799f6eb1a45feed5d8df0aea1ccb053d59d0acd49a69433bc793f93012fd2aa64cb66a1076c5b50248e6f66c2943b68d2d512b7338bc160"

RPROVIDES:${PN} += "config-lvm2 \
dont-stop-blk-availability-service \
libdevmapper-event-lvm2.so.2.03 \
libdevmapper-event-lvm2mirror.so.2.03 \
libdevmapper-event-lvm2raid.so.2.03 \
libdevmapper-event-lvm2snapshot.so.2.03 \
libdevmapper-event-lvm2thin.so.2.03 \
libdevmapper-event-lvm2vdo.so.2.03 \
lvm \
lvm2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
device-mapper \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
liblvm2cmd.so.2.03 \
libreadline.so.8 \
libselinux.so.1 \
libsystemd.so.0 \
libudev.so.1 \
modutils \
systemd"

inherit rpm
