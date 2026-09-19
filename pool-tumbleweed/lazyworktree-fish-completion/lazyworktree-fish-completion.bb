SUMMARY = "Fish Completion for lazyworktree"
DESCRIPTION = "Fish command line completion support for lazyworktree."
LICENSE = "Apache-2.0"

PV = "1.49.0"

RPM_NAME = "lazyworktree-fish-completion-1.49.0-1.2.noarch.rpm"
RPM_HASH = "890c5eead349f9f5847e72637e24b7a06b443d6e2d43f52b597afe711a91e2e73c6318258f749ed3b5aac9e50431902137361f6d32fc7dab3c6caec97846f33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lazyworktree-fish-completion"

RDEPENDS:${PN} += "fish \
lazyworktree"

inherit rpm
