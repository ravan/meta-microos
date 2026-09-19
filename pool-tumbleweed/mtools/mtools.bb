SUMMARY = "Tools to access MS-DOS filesystems without kernel drivers"
DESCRIPTION = "Mtools allows access to an MS-DOS file system on disk without \
mounting it. It includes commands for working with MS-DOS files: \
mdir, mcd, mcopy, and mformat. \
 \
XDF support for OS/2 is also provided."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.49"

RPM_NAME = "mtools-4.0.49-1.6.aarch64.rpm"
RPM_HASH = "cf0f94ec339911512543b5564e098ba8e844a5427017affb7272dba0b5c70b44294848bf76512ca5c09b29821c0cfd686e060ca88486ab492384ec9f9dec8e6a"

RPROVIDES:${PN} += "config-mtools \
mtools"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
