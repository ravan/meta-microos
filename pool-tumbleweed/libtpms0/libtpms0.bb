SUMMARY = "Library providing Trusted Platform Module (TPM) functionality"
DESCRIPTION = "A library providing TPM functionality for VMs. Targeted for integration \
into Qemu."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "libtpms0-0.10.2-1.3.aarch64.rpm"
RPM_HASH = "02cdef6fb54b3e8b2631112386e06c6e75774a1b7f274302c2681aad9c6be520e30a677a74e4e11ab1b2dc748be0d5bc30b345e04839799ec2349c304103e1a1"

RPROVIDES:${PN} += "libtpms.so.0 \
libtpms0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
