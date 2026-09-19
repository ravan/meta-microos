SUMMARY = "Bash Completion for syft"
DESCRIPTION = "Bash command line completion support for syft."
LICENSE = "Apache-2.0"

PV = "1.51.1"

RPM_NAME = "syft-bash-completion-1.51.1-1.1.noarch.rpm"
RPM_HASH = "2a84a142ec2ea261a167eba425ab2c0f5881b4151d5a6a56fa99b4a0ffe89ef2aa24a4f4eaa76b0f59bbdb26735644083345f45d3c0c403076c93dfd655e1460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syft-bash-completion"

RDEPENDS:${PN} += "bash-completion \
syft"

inherit rpm
