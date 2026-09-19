SUMMARY = "Bash Completion for kbom"
DESCRIPTION = "Bash command line completion support for kbom."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "kbom-bash-completion-0.3.4-1.4.noarch.rpm"
RPM_HASH = "a59a5ed38fc8a6e736fb15e3f571ae8cf7ed1e3a922381dd1b0cd2a1fb1bfdd2d29766a9ba148ef21b5ca094d9b4ebd26c17bf8cf917e588ce13bd81e88befaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbom-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kbom"

inherit rpm
