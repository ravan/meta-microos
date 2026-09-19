SUMMARY = "Fish Completion for chainguard-dfc"
DESCRIPTION = "Fish command line completion support for chainguard-dfc."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "chainguard-dfc-fish-completion-0.10.0-1.7.noarch.rpm"
RPM_HASH = "984834f3d7ca5fa9531c829a8503b78e78a59d221a8b867bef213263d75da2d1e6df391d257220422e0f7145d7de255cd420140b4b51c32bd561eba776a5ba9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chainguard-dfc-fish-completion"

RDEPENDS:${PN} += "chainguard-dfc \
fish"

inherit rpm
