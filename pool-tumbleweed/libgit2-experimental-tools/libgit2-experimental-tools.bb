SUMMARY = "A Git command-line interface based on libgit2"
DESCRIPTION = "This package contains a git cli based on libgit2."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.9.7"

RPM_NAME = "libgit2-experimental-tools-1.9.7-1.1.aarch64.rpm"
RPM_HASH = "afc82e6e58da0b0fa31cab4ee4b1d485b0e4228eb9bb7a20b3d7cff86ff102bcd66b98308d4e193692750e7498960aaccf8d42542be2ed2185bf25f6608206ee"

RPROVIDES:${PN} += "libgit2-experimental-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
