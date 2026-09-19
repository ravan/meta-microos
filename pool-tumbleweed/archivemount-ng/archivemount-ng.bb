SUMMARY = "Mount archives as a file system"
DESCRIPTION = "Archivemount is a piece of glue code between libarchive and FUSE. It can be \
used to mount a (possibly compressed) archive (as in .tar.gz or .zip or .iso) \
and use it like an ordinary filesystem. \
 \
This version of the package is a fork and continuation of the original \
archivemount, with fuse 3 support and bug fixes."
LICENSE = "0BSD & LGPL-2.1-or-later"

PV = "1b"

RPM_NAME = "archivemount-ng-1b-1.6.aarch64.rpm"
RPM_HASH = "af668fb95c923a714cded51d173db90da6e78fcc3f4718b7bd155bab80f0fcfcbc9422048a862bd7365da63cb8719d075d0d0fafb6775965521d6f23c6daddd6"

RPROVIDES:${PN} += "archivemount \
archivemount-ng"

RDEPENDS:${PN} += "fuse3 \
libarchive.so.13 \
libc.so.6 \
libfuse3.so.4 \
libstdc++.so.6"

inherit rpm
