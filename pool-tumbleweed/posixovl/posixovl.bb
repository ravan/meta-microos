SUMMARY = "POSIX overlay filesystem"
DESCRIPTION = "A FUSE filesystem that provides POSIX functionality - UNIX-style permissions, \
ownership, special files - for filesystems that do not have such, e.g. vfat. It \
can be seen as a contemporary equivalent of the UMSDOS fs."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "posixovl-1.4-1.12.aarch64.rpm"
RPM_HASH = "0b2ff9b81a6dd35af2bb30a994d4cb5d657e6c337e3f567e893e1768587a3eb013ea09a997310cefe03384077ed9917c7e3f3851b13d004339458498a8efbc24"

RPROVIDES:${PN} += "posixovl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2"

inherit rpm
