SUMMARY = "Command line tools for managing ACLs over NFSv4"
DESCRIPTION = "Command line tools for viewing and setting ACLs (Access Control Lists) \
when using NFSv4 to access a remote filesystem. The remote filesystem \
must also support ACLs."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "nfs4-acl-tools-0.4.2-1.5.aarch64.rpm"
RPM_HASH = "e98afc3524e484f3487edd5943d92572aaaf0c2b7ed212123b14373a5dbac0f216ecd887698a2894a8c8c57db6329182fc509a5206d4629a8969d70092bb4e22"

RPROVIDES:${PN} += "nfs4-acl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
