SUMMARY = "Zsh Completion for okteto"
DESCRIPTION = "zsh command line completion support for okteto."
LICENSE = "Apache-2.0"

PV = "3.22.0"

RPM_NAME = "okteto-zsh-completion-3.22.0-1.1.noarch.rpm"
RPM_HASH = "574e50d66358badf463cece817e425d13c83c1b33d773a9fd23f905b75c0e5f89885f63a3f48850a7a087eb987ede78a478d10a9b1f237add6218ed7b51fa217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteto-zsh-completion"

RDEPENDS:${PN} += "okteto"

inherit rpm
