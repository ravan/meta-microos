SUMMARY = "Fish Completion for prek"
DESCRIPTION = "Fish command line completion support for prek."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "prek-fish-completion-0.5.0-1.1.noarch.rpm"
RPM_HASH = "2516118200f87abc4cc71d352b612fb1c2c9e8fba3f104f86a7cfeb241f1131db6a842c6e80f27a4c8200d1f0babd15c6a2e77cf7df086b3f29d04f0a6bfb5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prek-fish-completion"

RDEPENDS:${PN} += "fish \
prek"

inherit rpm
