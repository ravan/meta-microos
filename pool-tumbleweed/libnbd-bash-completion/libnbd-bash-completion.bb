SUMMARY = "Bash tab-completion for libnbd"
DESCRIPTION = "Install this package if you want intelligent bash tab-completion \
for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25.7"

RPM_NAME = "libnbd-bash-completion-1.25.7-1.1.noarch.rpm"
RPM_HASH = "dfe47775910b761e41337a43096f44bdba630ab4561c6a14f47e2afb4502372e366f7156354d4d2b7b2d86fedf88ffb6f874c78e24ac473210181c85eae99004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnbd-bash-completion"

RDEPENDS:${PN} += "bash-completion \
libnbd0"

inherit rpm
