SUMMARY = "Fish Completion for zot-registry"
DESCRIPTION = "Fish command line completion support for zot-registry."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zot-registry-fish-completion-2.1.20-1.1.noarch.rpm"
RPM_HASH = "0adee8d40bed45aaa5d376a480a338c945294d60e0e0e0eb508d35dc21473b26796926066fa5d7cfb9a4f18da05c2644400c2a4d583f22de83c14aed2be8d1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zot-registry-fish-completion"

RDEPENDS:${PN} += "fish \
zot-registry"

inherit rpm
