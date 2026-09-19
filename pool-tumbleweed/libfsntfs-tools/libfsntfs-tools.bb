SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs-tools is a project to access the NTFS filesystem \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260827"

RPM_NAME = "libfsntfs-tools-20260827-1.1.aarch64.rpm"
RPM_HASH = "a95a2ed1780f662d568c6d3abcd9478fe95dcb9b87485661030881d5923f22923917c67db7cce20f1c04ff5563722ec927c653aaaa15a01979bc36a51f3d1a2c"

RPROVIDES:${PN} += "libfsntfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
libfuse3.so.4 \
libfusn.so.1 \
libfwnt.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
