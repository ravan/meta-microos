SUMMARY = "Bash Completion for kube-review"
DESCRIPTION = "Bash command line completion support for kube-review."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "kube-review-bash-completion-0.5.0-1.9.noarch.rpm"
RPM_HASH = "2ac5ce87fc86e2ea1f8bbf32c317e4531f244f7a5b33ca9ad8c561daf35c31217100675a4605180d9878197f61e741fdb8db27d68c82f33322f5b75943afd4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kube-review-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kube-review"

inherit rpm
