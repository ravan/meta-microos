SUMMARY = "LVM2 command line library"
DESCRIPTION = "The lvm2 command line library allows building programs that manage \
lvm devices without invoking a separate program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.38"

RPM_NAME = "liblvm2cmd2_03-2.03.38-2.5.aarch64.rpm"
RPM_HASH = "fc24b757cc2d4f9056565bbc2adbe48a9c3926eb0b34aec2de67f09f469aa55d9a7183ed810508e02b58ce107dc5aadf00c77c29ade6f3816527a0678c8bc511"

RPROVIDES:${PN} += "liblvm2cmd.so.2.03 \
liblvm2cmd2-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libselinux.so.1 \
libsystemd.so.0 \
libudev.so.1"

inherit rpm
