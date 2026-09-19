SUMMARY = "Necessary packages for plasma6-vault to support gocryptfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma6-vault gocryptfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-vault-backend-gocryptfs-6.7.5-1.1.noarch.rpm"
RPM_HASH = "5f5656f1150cad8826005d02842542639010c88372c147e26040a155b6486c56bb1f8b4721e7ceb9d2b57b4454d06b4ace43ac7368154d3e343c07a33fc5bb91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma6-vault-backend \
plasma6-vault-backend-gocryptfs"

RDEPENDS:${PN} += "gocryptfs \
plasma6-vault"

inherit rpm
