SUMMARY = "MIPL - Mobile IPv6 for Linux"
DESCRIPTION = "MIPL Mobile IPv6 for Linux is an implementation of the Mobility Support \
in IP version 6 (RFC 3775). \
 \
This user space part works together with Mobile IPv6 enabled Linux \
kernels.  See INSTALL and any other documents referred there for \
installation instructions and required kernel compile options. \
 \
MIPL Mobile IPv6 for Linux has been developed in the GO-Core Project at \
the Helsinki University of Technology.	See AUTHORS for core \
development team and THANKS for complete listing of contributors."
LICENSE = "GPL-2.0"

PV = "2.0.2.umip.0.4"

RPM_NAME = "mipv6d-2.0.2.umip.0.4-29.10.aarch64.rpm"
RPM_HASH = "ca1f3feabdd50908ff7542175856ce8b6ca96d391ce479935f4b1e08dc8ecc0c896a0e3d4bea63a75bb1b72114dd3ee608d691a92d5e35e9451b499d2050c1f0"

RPROVIDES:${PN} += "config-mipv6d \
mipv6d"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
