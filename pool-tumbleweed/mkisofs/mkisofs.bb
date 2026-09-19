SUMMARY = "A program to generate an ISO-9660/Joliet/HFS/UDF hybrid filesystem"
DESCRIPTION = "mkisofs is a pre-mastering program to generate filesystems following \
the ISO-9660 specification. It supports the Joliet, Rock Ridge and \
Apple extensions, as well as the creation of HFS/ISO-9660 and \
UDF/ISO-9660 hybrid filesystem images (images that can be mounted \
with either filesystem driver)."
LICENSE = "GPL-2.0-only"

PV = "3.02~a10"

RPM_NAME = "mkisofs-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "b56b1410697689fc52f8794f068c100b17117bb6584798bfa34ffbe39761fca15b3437ab80575e29b1f7d598b0762c2b8be4cccb65c9800cc71b7ee24fac771b"

RPROVIDES:${PN} += "mkisofs"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdrdeflt.so.1.0 \
libfile.so.1.0 \
libfind.so.4.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
zisofs-tools"

inherit rpm
