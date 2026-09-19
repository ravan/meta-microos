SUMMARY = "Development libraries for BLACS (openmpi5)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi5."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-openmpi5-devel-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "6e278e955a18f99a7de545af862d8e8bd012c11939e4232d3db9ee9e9f3c6d85fa0a2327a8d42665e9fd3b1fe4d5af8cb4b1bcaccf37a8a9ce71dc14a272b08b"

RPROVIDES:${PN} += "blacs-openmpi5-devel \
libblacs.so.2.2.2 \
libblacs2-openmpi5-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi5 \
libc.so.6 \
libmpi.so.40 \
openmpi5-devel"

inherit rpm
