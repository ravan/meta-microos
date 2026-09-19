SUMMARY = "Userspace Interface for Kernel DRM Services"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm2-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "40c99235504e451ae991f520bf10a68dc6235beaab5787afb871eed61a610fd7cc95742764a6f582e68245209128159560449a3a07c2e5c9c45c8d8b6f969ea2"

RPROVIDES:${PN} += "libdrm.so.2 \
libdrm2 \
libkms1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
