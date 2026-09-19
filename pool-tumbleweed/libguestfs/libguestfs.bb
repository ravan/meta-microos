SUMMARY = "Access and modify virtual machine disk images"
DESCRIPTION = "Libguestfs is a library for accessing and modifying virtual machine \
disk images.  http://libguestfs.org \
 \
Libguestfs uses Linux kernel and qemu code, and can access any type of \
guest filesystem that Linux and qemu can, including but not limited \
to: ext2/3/4, btrfs, FAT and NTFS, LVM, many different disk partition \
schemes, qcow, qcow2, vmdk."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "1538ff6039218be7b931412e75bfd8f713500f6382e8f10a141869a24242d79bdb0f7d5a182a46f9576f6d782d7c24c5155390489871e4542fd6d313b53f3cce"

RPROVIDES:${PN} += "config-libguestfs \
libguestfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15 \
libfuse3.so.4 \
libguestfs-appliance \
libguestfs.so.0 \
libm.so.6 \
libreadline.so.8 \
libtinfo.so.6 \
libtirpc.so.3 \
libxml2.so.16"

inherit rpm
