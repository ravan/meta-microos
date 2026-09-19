SUMMARY = "Zsh completion for highlight"
DESCRIPTION = "This package provides Zsh command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-zsh-completion-4.18-1.6.noarch.rpm"
RPM_HASH = "7278fd5a838e7bc3ac3c6f4af6c3ced143b34f44dc98dfab461d0bbaf46b3ac5cfdd14e872e3fad94db20ba6a8f7c9b45db62d34e8bb17d369e9654d6a97cb52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-zsh-completion"

RDEPENDS:${PN} += "highlight \
zsh"

inherit rpm
