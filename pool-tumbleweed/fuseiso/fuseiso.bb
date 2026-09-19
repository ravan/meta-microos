SUMMARY = "FUSE module to mount CD-ROM images with ISO9660 filesystems in them"
DESCRIPTION = "Fuseiso is a FUSE filesystem module which allows to mount many ISO9660 \
filesystem images (for CD-ROMs) as a non-root user using fuse. \
 \
It supports plain ISO9660 Level 1 and 2, with Rock Ridge, Joliet and \
zisofs extensions and also supports the CD-ROM image types img, bin, \
mdf and nrg."
LICENSE = "GPL-2.0-or-later"

PV = "20070708"

RPM_NAME = "fuseiso-20070708-53.8.aarch64.rpm"
RPM_HASH = "016de7b8976acfa332d3a1d8452d651b1fb5bbe9408cd7267d9e31b7d3b1138d41c85742c58622c6a3ca6bc2f9a05042e35b064a04ea0f1252abd6e7661762ec"

RPROVIDES:${PN} += "fuseiso"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libglib-2.0.so.0 \
libz.so.1"

inherit rpm
