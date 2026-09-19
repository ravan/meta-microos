SUMMARY = "NBD client library in userspace"
DESCRIPTION = "NBD — Network Block Device — is a protocol for accessing Block Devices \
(hard disks and disk-like things) over a Network. \
 \
This is the NBD client library in userspace, a simple library for \
writing NBD clients. \
 \
The key features are: \
 \
 * Synchronous and asynchronous APIs, both for ease of use and for \
   writing non-blocking, multithreaded clients. \
 \
 * High performance. \
 \
 * Minimal dependencies for the basic library. \
 \
 * Well-documented, stable API. \
 \
 * Bindings in several programming languages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25.7"

RPM_NAME = "libnbd-1.25.7-1.1.aarch64.rpm"
RPM_HASH = "41230c5ee82e5a0f0fa625cf41f8fe2a743840ca4e7bdfed262a6cac7567836d21ec6f3f89a88abaa7eecc3831a3dff504c348ada0b1023ecc3f808a91c8d8da"

RPROVIDES:${PN} += "libnbd"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libnbd.so.0 \
libnbd0 \
libublksrv.so.0"

inherit rpm
