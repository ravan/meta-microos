SUMMARY = "NTFS Support in Userspace"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "GPL-2.0-or-later"

PV = "2026.7.7"

RPM_NAME = "ntfs-3g-2026.7.7-1.1.aarch64.rpm"
RPM_HASH = "b4ea55e8d177d8ef96a8b5dc7be9877865bb39d648504a93a8a418e248471e10fff8192d5b67edd92f571336cae8168fb24666b7bfc19546ffb51300ea2394ba"

RPROVIDES:${PN} += "ntfs-3g \
ntfsprogs-fuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libntfs-3g.so.90"

inherit rpm
