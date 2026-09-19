SUMMARY = "Development libraries for BLACS (openmpi4)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi4."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-openmpi4-devel-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "4d60d546075185d642c08f60f7fbe5840c0ae2d4de012e5deee2aeeeabe46b68ddece63e22c024038cf7ae0e6a98d5d66b94e860e8fef94ef4677508b2b82177"

RPROVIDES:${PN} += "blacs-openmpi4-devel \
libblacs.so.2.2.2 \
libblacs2-openmpi4-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi4 \
libc.so.6 \
libmpi.so.40 \
openmpi4-devel"

inherit rpm
