SUMMARY = "A Git command-line interface based on libgit2"
DESCRIPTION = "This package contains a git cli based on libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.9.7"

RPM_NAME = "libgit2-tools-1.9.7-1.1.aarch64.rpm"
RPM_HASH = "a7a81317cc54c2f04391f37d7d69c1160bf530402ebd2848a7f40c77ce222d0c0be0111e57ee4fa7d4356d59249d39d00d6f897e2a1868b5bb2bd49c4949886e"

RPROVIDES:${PN} += "libgit2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
