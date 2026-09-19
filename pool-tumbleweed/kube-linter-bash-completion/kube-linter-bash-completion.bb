SUMMARY = "Bash Completion for kube-linter"
DESCRIPTION = "Bash command line completion support for kube-linter."
LICENSE = "Apache-2.0"

PV = "0.8.3"

RPM_NAME = "kube-linter-bash-completion-0.8.3-1.5.noarch.rpm"
RPM_HASH = "ae39d7aed9bf9663cf9f4223f63ed1dd5b1fa4cdf66c25f9c775feafa723b52774ae854304c2d2a047bc3c7b3f73d51f342dc3056e4159da35881666147a1a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kube-linter-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kube-linter"

inherit rpm
