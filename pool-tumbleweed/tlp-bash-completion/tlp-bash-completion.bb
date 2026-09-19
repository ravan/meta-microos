SUMMARY = "Bash Completion for tlp"
DESCRIPTION = "The official bash completion script for tlp."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-bash-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "70f91d1044a22c9c15dbf897c6bbcc804ba4b1880608113f57ab9d4d4077682f8cf0ae4e54980945917238d96007eea379a0f1f47873a2e106703742ff326853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tlp"

inherit rpm
