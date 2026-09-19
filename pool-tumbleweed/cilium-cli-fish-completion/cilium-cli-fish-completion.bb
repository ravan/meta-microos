SUMMARY = "Fish Completion for cilium-cli"
DESCRIPTION = "Fish command line completion support for cilium-cli."
LICENSE = "Apache-2.0"

PV = "0.19.7"

RPM_NAME = "cilium-cli-fish-completion-0.19.7-1.1.noarch.rpm"
RPM_HASH = "bd90c3c44b3cec68b45d9006f5769387facc59383ef24fb6732e96b82bf950c491662e98155d4b334e4699317304dca5fd3e21e805733324ca6469eb839db96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cilium-cli-fish-completion"

RDEPENDS:${PN} += "cilium-cli"

inherit rpm
