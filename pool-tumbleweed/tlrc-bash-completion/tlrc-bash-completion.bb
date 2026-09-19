SUMMARY = "Bash Completion for tlrc"
DESCRIPTION = "Bash command-line completion support for tlrc."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "tlrc-bash-completion-1.13.1-1.4.noarch.rpm"
RPM_HASH = "68c8dbdf5b87d86ce10e061970581a71e34ecb938e64f7348ad833b293581c16ed5a13198a4e8891e8a68913e6321804109a5c9d20dbe5aac397f3fabec478c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlrc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tlrc"

inherit rpm
