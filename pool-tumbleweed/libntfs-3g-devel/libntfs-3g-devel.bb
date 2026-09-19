SUMMARY = "NTFS Support in Userspace -- Development Files"
DESCRIPTION = "NTFS-3G allows for read/write access to NTFS partitions which can be \
shared with Windows XP, Windows Server 2003, Windows 2000, Windows \
Vista and Windows Seven."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.7.7"

RPM_NAME = "libntfs-3g-devel-2026.7.7-1.1.aarch64.rpm"
RPM_HASH = "241e0ac0e575dd49ef817fce84cc8354ead325ebb1706355861db7666e55fc3cb92afdd50c433ae68a668fa89fcc0d322927e6160f7f20990e3e0f39b2575113"

RPROVIDES:${PN} += "libntfs-3g-devel \
ntfs-3g-devel \
pkgconfig-libntfs-3g"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libntfs-3g90"

inherit rpm
