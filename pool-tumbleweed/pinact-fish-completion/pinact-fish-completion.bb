SUMMARY = "Fish Completion for pinact"
DESCRIPTION = "Fish command line completion support for pinact."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "pinact-fish-completion-4.1.1-1.1.noarch.rpm"
RPM_HASH = "916aafd1e9bb21fa1ab91801a7df62b7bd8f88707dfe7d3f1ccf9a6bd0fdd3bdc1da4a5a6cd490a77a8ea718f80ddfdead900b143c87f69e6bbe2cd5d32f6be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pinact-fish-completion"

RDEPENDS:${PN} += "fish \
pinact"

inherit rpm
