SUMMARY = "Fish Completion for pueue"
DESCRIPTION = "The official bash completion script for pueue."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "pueue-bash-completion-3.4.1-1.12.noarch.rpm"
RPM_HASH = "69be9765d46075c8fa77b329c3a9e0f47d8d4fa56e3bbe9d8cb628f1d85b8ed45c0a55f5a2d27edf81abb11afe814449c23c076f7a89ed620551a17d5616b1d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pueue-bash-completion"

RDEPENDS:${PN} += "pueue"

inherit rpm
