SUMMARY = "Bash Completion for inspektor-gadget"
DESCRIPTION = "Bash command line completion support for inspektor-gadget."
LICENSE = "Apache-2.0"

PV = "0.55.1"

RPM_NAME = "inspektor-gadget-bash-completion-0.55.1-1.1.noarch.rpm"
RPM_HASH = "42e28e57a889a216477f3f6541da293c306f47ecc524472c8b93bc156dc431888b1ec77375e4fcc618ce6af017bafa04d61f607962a115ce7158f35bfd3906d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inspektor-gadget-bash-completion"

RDEPENDS:${PN} += "bash-completion \
inspektor-gadget"

inherit rpm
