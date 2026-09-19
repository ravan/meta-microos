SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "29.7.2_ce"

RPM_NAME = "docker-fish-completion-29.7.2_ce-41.1.noarch.rpm"
RPM_HASH = "ca0ad868f57eec927825297fd18566b1d64b853bc07a602a32817364cb4faee2364f02b26f87808885263060ead58b6aeddc5a6707878278bd685998224a8f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"

RDEPENDS:${PN} += "docker \
fish"

inherit rpm
