SUMMARY = "Zsh Completion for clusteradm"
DESCRIPTION = "zsh command line completion support for clusteradm."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "clusteradm-zsh-completion-1.3.1-1.4.noarch.rpm"
RPM_HASH = "17543bc73247352a2441ee4b43c5981886a0528190bbb279f16aa4cea60b3bcffaf9261b1e9064789ab6138ebc36c4a3560cd09045dd77f1a42913474a56f7f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusteradm-zsh-completion"

RDEPENDS:${PN} += "clusteradm \
zsh"

inherit rpm
