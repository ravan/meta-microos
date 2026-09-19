SUMMARY = "Bash Completion for bomctl"
DESCRIPTION = "Bash command line completion support for bomctl."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "bomctl-bash-completion-0.4.3-1.8.noarch.rpm"
RPM_HASH = "d8ef36bbb1f42573d2407d3643943ef0c2a58f751e8bebe6d920454705a1358a7acc4f547842a5c91e1471c0554a3d8f3802ef1698c2a9c17f8938753cca5540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bomctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bomctl"

inherit rpm
