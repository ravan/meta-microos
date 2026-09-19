SUMMARY = "GNUnet FUSE interface"
DESCRIPTION = "GNUnet-fuse allows you to mount directories published on GNUnet. \
 \
GNUnet is peer-to-peer framework focusing on security. The first and \
primary application for GNUnet is anonymous file-sharing."
LICENSE = "GPL-3.0-only"

PV = "0.26.0"

RPM_NAME = "gnunet-fuse-0.26.0-1.3.aarch64.rpm"
RPM_HASH = "96dd9b99ec2f12ece2b86be4f3dfa34838824ac3cd138b4441866544454ab4211a811b9c4375ae03fd10625306381b876c867cf011ffce158bfd68f5a1131cd9"

RPROVIDES:${PN} += "gnunet-fuse"

RDEPENDS:${PN} += "gnunet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libgnunetfs.so.2 \
libgnunetutil.so.20"

inherit rpm
