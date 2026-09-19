SUMMARY = "Zsh Completion for kube-review"
DESCRIPTION = "zsh command line completion support for kube-review."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "kube-review-zsh-completion-0.5.0-1.9.noarch.rpm"
RPM_HASH = "a1a83730e09a1014fbce4c4ac22ee5f29db1ad9432fb661efac6d09601f25467b1b939f74dbfa8a2346b3ef23a789823a535346621d6d90686c25638b3a9d517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kube-review-zsh-completion"

RDEPENDS:${PN} += "kube-review"

inherit rpm
