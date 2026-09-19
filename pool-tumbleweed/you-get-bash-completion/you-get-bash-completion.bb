SUMMARY = "Bash completion for you-get"
DESCRIPTION = "Bash command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1743"

RPM_NAME = "you-get-bash-completion-0.4.1743-3.1.noarch.rpm"
RPM_HASH = "81790695f798a822b666a7bcb69bc6034f1a93bdf999f25e54f5f82b7887127ab03d43284f23d908f776f6ec3c63b27a3be1f24e90629f51e33651adbc725697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
