SUMMARY = "Zathura zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for zathura"
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-zsh-completion-2026.07.18-1.1.noarch.rpm"
RPM_HASH = "9fe6f941655fbfb8436a19b4ff765d87443c39a82cb781deca378cbefeece679e52e0742b4be7ac43554a610e4b680888c4508f21c9a458516a7a95721173ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zathura-zsh-completion"

RDEPENDS:${PN} += "zathura \
zsh"

inherit rpm
