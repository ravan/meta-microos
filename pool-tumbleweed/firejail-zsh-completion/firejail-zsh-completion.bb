SUMMARY = "Firejail zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for firejail"
LICENSE = "GPL-2.0-only"

PV = "0.9.80"

RPM_NAME = "firejail-zsh-completion-0.9.80-1.4.noarch.rpm"
RPM_HASH = "ed9d24fe7db5d2c576f3bf30249df97b797490694356a9092794b18476280cd89062c6b143aea7ea7a644e152f547e0c1ab9e88d9b71654c8479663d373211a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firejail-zsh-completion"

RDEPENDS:${PN} += "firejail \
zsh"

inherit rpm
