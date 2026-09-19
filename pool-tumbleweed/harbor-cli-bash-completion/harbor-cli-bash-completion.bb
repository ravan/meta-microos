SUMMARY = "Bash Completion for harbor-cli"
DESCRIPTION = "Bash command line completion support for harbor-cli."
LICENSE = "Apache-2.0"

PV = "0.0.25"

RPM_NAME = "harbor-cli-bash-completion-0.0.25-1.1.noarch.rpm"
RPM_HASH = "00566d338227952c59324625574d939073084b9e2abf42403bfae8c579e1213a020a9feea8fa93aedde34cf0b75d8649097a8eed1225704de209c8625cf73fed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "harbor-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
harbor-cli"

inherit rpm
