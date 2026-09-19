SUMMARY = "Zsh Completion for kubectl-retina"
DESCRIPTION = "zsh command line completion support for kubectl-retina."
LICENSE = "Apache-2.0"

PV = "0.0.16"

RPM_NAME = "kubectl-retina-zsh-completion-0.0.16-1.13.noarch.rpm"
RPM_HASH = "93763d4ab904f6fee5bdbd0491674ee6065f0df2edbde91f1473b9e428d610d823c6ff96712f748fee8ae8eddd1ed7860dd97d4d75cb050764574af77330b607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-retina-zsh-completion"

RDEPENDS:${PN} += "kubectl-retina"

inherit rpm
