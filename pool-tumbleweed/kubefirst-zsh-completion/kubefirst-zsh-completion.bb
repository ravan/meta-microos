SUMMARY = "Zsh Completion for kubefirst"
DESCRIPTION = "zsh command line completion support for kubefirst."
LICENSE = "MIT"

PV = "2.10.5"

RPM_NAME = "kubefirst-zsh-completion-2.10.5-1.7.noarch.rpm"
RPM_HASH = "47ed0bf75489b4b86f6d1aad5bc4a77442af77a69c1b143c3070b08d30a58fe76f0df077c067b922a64b306285a31581073ccc8a2bc029b6ffd16eaa853c08d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubefirst-zsh-completion"

RDEPENDS:${PN} += "kubefirst"

inherit rpm
