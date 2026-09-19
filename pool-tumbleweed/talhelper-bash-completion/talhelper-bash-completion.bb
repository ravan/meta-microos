SUMMARY = "Bash Completion for talhelper"
DESCRIPTION = "Bash command line completion support for talhelper."
LICENSE = "BSD-3-Clause"

PV = "3.1.17"

RPM_NAME = "talhelper-bash-completion-3.1.17-1.1.noarch.rpm"
RPM_HASH = "17d03c8db01bd464c4735a03df889acdd6fe6a8bc04313f2e1a909038ce64814ebe09c361557d1862f98e5734a3d6f1f09fd4208f577ed1d8de70805c75ab5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "talhelper-bash-completion"

RDEPENDS:${PN} += "bash-completion \
talhelper"

inherit rpm
