SUMMARY = "GPG keys of various Linux distributions"
DESCRIPTION = "GPG keys used by various Linux distributions to sign packages."
LICENSE = "CC0-1.0"

PV = "1.122"

RPM_NAME = "distribution-gpg-keys-1.122-1.1.noarch.rpm"
RPM_HASH = "cfca3e610a1e47668ab62610e2d640ee8efca70537a457a607aa8cf5f0accb57872c2ba831de998999db83da3ea231f0aadcf845d97ceb5a1ff6190966db8787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-gpg-keys"

RDEPENDS:${PN} += ""

inherit rpm
