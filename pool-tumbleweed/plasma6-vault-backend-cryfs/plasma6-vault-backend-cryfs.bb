SUMMARY = "Necessary packages for plasma6-vault to support cryfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma6-vault cryfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-vault-backend-cryfs-6.7.5-1.1.noarch.rpm"
RPM_HASH = "8009db64d9a345563440d7fec403308e7ef0e37d67151d65303de9c6d71f6e9c25fcba582e6cf17519177ec95187d1d11b64738e83b56f5d055f0bfa9343ce92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma6-vault-backend \
plasma6-vault-backend-cryfs"

RDEPENDS:${PN} += "cryfs \
plasma6-vault"

inherit rpm
