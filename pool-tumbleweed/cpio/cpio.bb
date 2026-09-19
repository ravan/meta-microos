SUMMARY = "A Backup and Archiving Utility"
DESCRIPTION = "GNU cpio is a program to manage archives of files. Cpio copies files \
into or out of a cpio or tar archive. An archive is a file that contains \
other files plus information about them, such as their pathname, owner, \
time stamps, and access permissions. The archive can be another file on \
the disk, a magnetic tape, or a pipe."
LICENSE = "GPL-3.0-only"

PV = "2.15"

RPM_NAME = "cpio-2.15-9.1.aarch64.rpm"
RPM_HASH = "6958835933dda1404a396f523c2e9171e4b63cf828e056b0afaa03706d7a56dcec19fc80b40cf6c4d06d3df003eea2b4ffad9f810c04a7deea0ce2ebb2e2c927"

RPROVIDES:${PN} += "cpio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
