SUMMARY = "Zsh Completion for nfpm"
DESCRIPTION = "zsh command line completion support for nfpm."
LICENSE = "MIT"

PV = "2.47.0"

RPM_NAME = "nfpm-zsh-completion-2.47.0-1.3.noarch.rpm"
RPM_HASH = "a65eee50d830de89ff56cd2381cf1267ba936f46310af41660bfbcc2be258cb402a1947357745134572396c6495c429c3995182ba8ab8b30bd3694addf440582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nfpm-zsh-completion"

RDEPENDS:${PN} += "nfpm"

inherit rpm
