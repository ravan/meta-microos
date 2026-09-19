SUMMARY = "Fish Completion for holos"
DESCRIPTION = "Fish command line completion support for holos."
LICENSE = "Apache-2.0"

PV = "0.106.0"

RPM_NAME = "holos-fish-completion-0.106.0-1.6.noarch.rpm"
RPM_HASH = "7c62dc9e494e28eb624201c82aaa60abea2e5fec4c6a519194e2c49357ec812c5a28c6c545e7f664bfdc104fd7685430230e78352453f80a86de342811b8427d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "holos-fish-completion"

RDEPENDS:${PN} += "fish \
holos"

inherit rpm
