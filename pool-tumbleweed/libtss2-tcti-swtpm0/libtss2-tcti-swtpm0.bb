SUMMARY = "TCTI swtpm interface library"
DESCRIPTION = "A TCTI for interaction with the TPM2 software simulator. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-tcti-swtpm0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "7401d1638b15d0213b50fd503f8b08e347c91f2843836ba9e19ed53415536a718de1bee5b712380c45d4709011ec6aead138e2b2a0a677850a3aa538d7c7ea11"

RPROVIDES:${PN} += "libtss2-tcti-swtpm.so.0 \
libtss2-tcti-swtpm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
