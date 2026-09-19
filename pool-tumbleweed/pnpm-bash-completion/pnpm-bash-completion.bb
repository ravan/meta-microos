SUMMARY = "Bash completion for pnpm"
DESCRIPTION = "Bash command line completion support for pnpm."
LICENSE = "MIT"

PV = "11.9.0"

RPM_NAME = "pnpm-bash-completion-11.9.0-1.1.noarch.rpm"
RPM_HASH = "6d896d445c69d5aeed708a935f832549350482c265187e372fed6cc40182f946bfbc0e9aa27db9d14613f308b8c75af9ed434921a11ba0c35562e8b003bbac67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnpm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
