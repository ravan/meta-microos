SUMMARY = "NTFS Support in Userspace -- Library"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.7.7"

RPM_NAME = "libntfs-3g90-2026.7.7-1.1.aarch64.rpm"
RPM_HASH = "3ca6aeaf0c354b6d22007575e5b91860715f880d596f6970ce8a6070086cbbe614671b655f5a09e8f93bf4528e1b5ae44afb2a8b690bd49644b0ccbd5232895b"

RPROVIDES:${PN} += "libntfs-3g.so.90 \
libntfs-3g90"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhd.so.25"

inherit rpm
