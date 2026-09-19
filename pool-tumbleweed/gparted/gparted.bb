SUMMARY = "Gnome Partition Editor"
DESCRIPTION = "GParted is a utility for creating, destroying, resizing, moving, \
checking and copying partitions, and the filesystems on them. This is \
useful for creating space for new operating systems, reorganizing \
disk usage, copying data residing on hard disks and mirroring one \
partition with another (disk imaging)."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "gparted-1.8.1-2.3.aarch64.rpm"
RPM_HASH = "2b3aac6c4d944ad33bd9fab103ae8691718e675af7609b98588a7e51274399415a2a050dddf7e95f9d01a3d6fe5d35f3fed32296ae8e4b6553b3af63df261045"

RPROVIDES:${PN} += "gparted"

RDEPENDS:${PN} += "/usr/bin/sh \
gpart \
hdparm \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libparted-fs-resize.so.0 \
libparted.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
mtools \
parted \
pkexec \
polkit \
util-linux"

inherit rpm
