SUMMARY = "A library implementing the SSH2 protocol"
DESCRIPTION = "libssh2 is a library implementing the SSH2 protocol as defined by \
Internet Drafts: SECSH-TRANS, SECSH-USERAUTH, SECSH-CONNECTION, \
SECSH-ARCH, SECSH-FILEXFER, SECSH-DHGEX, SECSH-NUMBERS, and \
SECSH-PUBLICKEY."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libssh2-devel-1.11.1-4.1.aarch64.rpm"
RPM_HASH = "d2dfe162136274222eb8c2639600eb17cb179da8ef7e6f19b8df54c4f51cf208fb21ed594c6603ec96dd71974f54048bf4cda0fddb631229e41ca06bb4b9f5ae"

RPROVIDES:${PN} += "cmake-libssh2 \
libssh2-devel \
pkgconfig-libssh2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libssh2-1 \
pkgconfig-libcrypto"

inherit rpm
