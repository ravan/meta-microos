SUMMARY = "Zsh Completion for kyverno"
DESCRIPTION = "zsh command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "kyverno-zsh-completion-1.19.0-1.1.noarch.rpm"
RPM_HASH = "7bbe465c65e93e04d190cbbcb9e2f632346bcfb974c696740ea95e7f59e312e1435592baa1cfaa815d1bb0c8996cf57d827bbf7b72c0470e8c6ba59946693723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-zsh-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
