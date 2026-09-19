SUMMARY = "Unbound Anchor cert management tools"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package contains the tools to manage the anchor certs."
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "unbound-anchor-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "1d4a941d7142fec1b74ec116a0bfd936ac6c4beaee23d9231b218943878d9608163b91ee36ca5484b25b301dd796b774ddd0103fded3243eb5a05a49dced96b8"

RPROVIDES:${PN} += "config-unbound-anchor \
group-unbound \
unbound-anchor \
user-unbound"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libssl.so.3 \
libunbound.so.8 \
sysuser-shadow"

inherit rpm
