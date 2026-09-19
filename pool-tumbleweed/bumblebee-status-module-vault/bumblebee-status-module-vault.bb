SUMMARY = "Copy passwords from a password store"
DESCRIPTION = "Copy passwords from a password store to the clipboard."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-vault-2.1.5-4.7.noarch.rpm"
RPM_HASH = "398e74dfcff2f4faaecb21034c2a4f465c9cc5c020634ef86dd2f16ec287552c905f23186315d6a1921ac5c468dc23e0ff9ff35e0a48e83ba1dd8264bb435abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-vault"

RDEPENDS:${PN} += "bumblebee-status \
password-store"

inherit rpm
