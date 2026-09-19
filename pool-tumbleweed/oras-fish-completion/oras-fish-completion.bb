SUMMARY = "Fish Completion for oras"
DESCRIPTION = "Fish command line completion support for oras."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oras-fish-completion-1.3.4-1.1.noarch.rpm"
RPM_HASH = "20cb94ee6e6e588d4ae34fc171312b14f59bbfe74885a942ccd45e71ce8f75e0738c6333c5130d6d1ebd65f2925960c84d51b81d66c2bcabae5e9bfe8927a36b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oras-fish-completion"

RDEPENDS:${PN} += "oras"

inherit rpm
