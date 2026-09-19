SUMMARY = "Fish completion for pyenv"
DESCRIPTION = "Fish command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "pyenv-fish-completion-2.8.4-1.1.noarch.rpm"
RPM_HASH = "5252b7ac698d29017a2ed83b7ec9e0db2b4b362c280ad12010dd26a63fc2647ff4bff3eae7fcf44a988179a5a2cfe09c736db6bbd9dd1290f98f92828b7a65c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-fish-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
