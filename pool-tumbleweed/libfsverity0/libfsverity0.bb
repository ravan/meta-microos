SUMMARY = "Library package for fsverity-utils"
DESCRIPTION = "Shared-object dependencies for fsverity-utils."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "libfsverity0-1.7-1.3.aarch64.rpm"
RPM_HASH = "055d9bb90768b24d002629366a66f66c93960f659bbf54ed0b5a7e68a114bf155d71bca0780b85dce4f0f5ec629e580321a6e045ca7579b72417914df4a42b83"

RPROVIDES:${PN} += "libfsverity.so.0 \
libfsverity0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3"

inherit rpm
