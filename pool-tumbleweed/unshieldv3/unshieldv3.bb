SUMMARY = "A Program to Extract InstallShield V3 (Z) archives"
DESCRIPTION = "A Program to Extract InstallShield V3 (Z) archives. \
 \
InstallShield Z format is a compressed archive format used by \
version 3 of the InstallShield installation software."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "unshieldv3-0.2.2-1.3.aarch64.rpm"
RPM_HASH = "b8a92b608fae47a2cae391f4e5eb826aa796ff8a906cc17887ccb05c7c198e704465164294944c7d0fbe7b37028d88158aa2eea3e9e8aab2df6c892d9096b98a"

RPROVIDES:${PN} += "unshieldv3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
