SUMMARY = "Bash Completion for bootiso"
DESCRIPTION = "Bash command line completion support for bootiso."
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "bootiso-bash-completion-4.2.0-3.10.noarch.rpm"
RPM_HASH = "3abfe89e837d43856bae9dc12c86a5ad2e366ce6687fb129352f3808a1ae7d872fb140c1b43c4fabfb6eed5198d9c9670363c6895002c3851981d220c853793c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootiso-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bootiso"

inherit rpm
