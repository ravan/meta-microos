SUMMARY = "Utilities for Making and Checking MS-DOS FAT File Systems on Linux"
DESCRIPTION = "The dosfstools package includes the mkdosfs and dosfsck utilities, which \
respectively make and check MS-DOS FAT file systems on hard drives or on \
floppies."
LICENSE = "GPL-3.0-or-later"

PV = "4.2"

RPM_NAME = "dosfstools-4.2-4.14.aarch64.rpm"
RPM_HASH = "674346b39901826ec247fd0d58ed947c9d558e8e449b2a0924f52fe2be071a1712681cf5c00a3d6086e54e021fc5fe73f15b065d9cb9f6e69c6574c5c85ef688"

RPROVIDES:${PN} += "dosfsck \
dosfstools \
mkdosfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
