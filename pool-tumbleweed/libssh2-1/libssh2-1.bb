SUMMARY = "A library implementing the SSH2 protocol"
DESCRIPTION = "libssh2 is a library implementing the SSH2 protocol as defined by \
Internet Drafts: SECSH-TRANS, SECSH-USERAUTH, SECSH-CONNECTION, \
SECSH-ARCH, SECSH-FILEXFER, SECSH-DHGEX, SECSH-NUMBERS, and \
SECSH-PUBLICKEY."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libssh2-1-1.11.1-4.1.aarch64.rpm"
RPM_HASH = "c1f8f4dba263682de0ffa8651dec799b1ca6d1aa3ff947c16ad0a3a0beb732242b558888375eb438d3a16b2723df729b1b134ce781fec403fc320fe3c7be493f"

RPROVIDES:${PN} += "libssh2-1 \
libssh2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
