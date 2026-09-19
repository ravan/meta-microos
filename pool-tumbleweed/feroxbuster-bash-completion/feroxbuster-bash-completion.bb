SUMMARY = "Bash Completion for feroxbuster"
DESCRIPTION = "Bash completion script for feroxbuster."
LICENSE = "MIT"

PV = "2.13.1"

RPM_NAME = "feroxbuster-bash-completion-2.13.1-1.7.noarch.rpm"
RPM_HASH = "a318079aadc9c5714caac16b93d2c5a41b720b156237dcf4eabac7580d799dbec59586ea6d0e46b609034a7531ba43c2fece3a05e93bf7e8fa8dbea9308d391f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "feroxbuster-bash-completion"

RDEPENDS:${PN} += "bash-completion \
feroxbuster"

inherit rpm
