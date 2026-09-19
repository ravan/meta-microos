SUMMARY = "FUSE based filesystem using ObexFTP"
DESCRIPTION = "ObexFS is a fuse (FUSE-based filesystem) using obexftp (ObexFTP) to \
access files on mobile phones."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "obexfs-0.12-3.17.aarch64.rpm"
RPM_HASH = "ddeaa8a88cbefca0e70c737796076cbf02a4829854a48484552f68816420531c18bc79110071b1aad3c037c8e0502a9ba623e2bb272121b5acfe57a3e75141d9"

RPROVIDES:${PN} += "obexfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libobexftp.so.0"

inherit rpm
