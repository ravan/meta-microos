SUMMARY = "Fish Completion for ghq"
DESCRIPTION = "Fish command line completion support for ghq."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "ghq-fish-completion-1.10.1-1.1.noarch.rpm"
RPM_HASH = "7d467ad90866620d1dd3410050f3b3e0e2fdeb868edf505934e78002ceaea376a07e767cb07ee7734ec7038cebbcfae1a3736b283831f6014cc2481ec2fa57be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghq-fish-completion"

RDEPENDS:${PN} += "ghq"

inherit rpm
