SUMMARY = "Fish Completion for river"
DESCRIPTION = "Fish command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-fish-completion-0.3.12-2.6.noarch.rpm"
RPM_HASH = "95bca84ac0eb1d06efc5103a2ab87945601291cc82793621061b8e88883e6c832edd1d0d44654fad0d377b12ebb7aecf9b2a03e4b48a8e6479a91bfcaa5e73da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-fish-completion"

RDEPENDS:${PN} += "fish \
river"

inherit rpm
