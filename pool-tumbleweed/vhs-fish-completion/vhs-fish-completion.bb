SUMMARY = "Fish Completion for vhs"
DESCRIPTION = "Fish command-line completion support for vhs."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "vhs-fish-completion-0.9.0-1.19.noarch.rpm"
RPM_HASH = "668487798d562fc8080424ca0a530a9d1f88713581b9cd793f682aa6990c5d0863de5d178f14e4b7de3e8893fa983e93f77f38c623854a7084fb37c8145de56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vhs-fish-completion"

RDEPENDS:${PN} += "fish \
vhs"

inherit rpm
