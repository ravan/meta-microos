SUMMARY = "Bash Completion for nfpm"
DESCRIPTION = "Bash command line completion support for nfpm."
LICENSE = "MIT"

PV = "2.47.0"

RPM_NAME = "nfpm-bash-completion-2.47.0-1.3.noarch.rpm"
RPM_HASH = "dd12462f0d046fea950d36a168151c95263b20ef9495117814f0608ae352d94ffad965b1e30feb4b102b72a8e989e8d94a81d39cabedd41915489ddf6239cc77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nfpm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nfpm"

inherit rpm
