SUMMARY = "Bash Completion for ghq"
DESCRIPTION = "Bash command line completion support for ghq."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "ghq-bash-completion-1.10.1-1.1.noarch.rpm"
RPM_HASH = "3da98bb1ac9845c28261b0b1cfda43729e050fba545db7d310bc5bb59dfe60f5514603367538d05e1ae17985f712ee83a6738c9a707f35b911a11afbb7ed2475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghq-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ghq"

inherit rpm
