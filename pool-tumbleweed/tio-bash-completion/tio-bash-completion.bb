SUMMARY = "Bash Completion for tio"
DESCRIPTION = "Bash completion script for tio."
LICENSE = "GPL-2.0-or-later"

PV = "3.9"

RPM_NAME = "tio-bash-completion-3.9-1.6.noarch.rpm"
RPM_HASH = "ef8c4e3c4f2d6fc6158326eec9b4661f51d8320877345a166cf326557e78e1cbd8c1d5f954464cbe940ed46af993005d1532818cc5b3cd9a063f112e3d3ae2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tio-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tio"

inherit rpm
