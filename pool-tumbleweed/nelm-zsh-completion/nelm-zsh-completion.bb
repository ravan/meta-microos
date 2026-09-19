SUMMARY = "Zsh Completion for nelm"
DESCRIPTION = "zsh command line completion support for nelm."
LICENSE = "Apache-2.0"

PV = "1.25.3"

RPM_NAME = "nelm-zsh-completion-1.25.3-1.2.noarch.rpm"
RPM_HASH = "f73d58b8e08fb1f6a6a189f0d194a82de2e15fee66e8d3b50a9a5a6899b5da73a7374f023f85c0e1359cafd8341765f4b45a7efef16f70ebe122a80a36bbcd6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nelm-zsh-completion"

RDEPENDS:${PN} += "nelm \
zsh"

inherit rpm
