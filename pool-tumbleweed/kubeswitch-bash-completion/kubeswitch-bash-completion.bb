SUMMARY = "Bash Completion for kubeswitch"
DESCRIPTION = "Bash command line completion support for kubeswitch."
LICENSE = "Apache-2.0"

PV = "0.9.3"

RPM_NAME = "kubeswitch-bash-completion-0.9.3-1.10.noarch.rpm"
RPM_HASH = "3957075749e4e12e21156ec1759a80dfe5292839d986e1eb6349f94c4ffab0700cb6988b0c336d8e0e913d3ed52436f1c9e98e9fc69988ce370b36970f9fa18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeswitch-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubeswitch"

inherit rpm
