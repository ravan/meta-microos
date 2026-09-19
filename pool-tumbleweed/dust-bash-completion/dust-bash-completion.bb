SUMMARY = "Bash completion for dust"
DESCRIPTION = "Bash command line completion support for dust."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "dust-bash-completion-1.2.5-1.2.noarch.rpm"
RPM_HASH = "812efe525dfafdc7cbf1c867a71c72277b09c23b158b9872f17d5633da2d8f744a8f7c8c4d9b1a6badb7be075e586bace42ecc3cb67e90e9dd46f205cfec0724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
