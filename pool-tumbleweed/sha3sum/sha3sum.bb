SUMMARY = "SHA-3 and Keccak checksum utility"
DESCRIPTION = "sha3sum contains command line utilities for the Keccak, SHA-3, SHAKE, and \
RawSHAKE checksum utilities \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3)."
LICENSE = "ISC"

PV = "1.2.5"

RPM_NAME = "sha3sum-1.2.5-1.3.aarch64.rpm"
RPM_HASH = "f0ed294ea0b91eebff51fff9c74d40e1f511e54bc4222577bf0519fefff498f9f5a06b0a3f8481b3f7ab882b8d0a6f66133015a2340bdf5ecca0298136484a5c"

RPROVIDES:${PN} += "sha3sum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeccak.so.1"

inherit rpm
