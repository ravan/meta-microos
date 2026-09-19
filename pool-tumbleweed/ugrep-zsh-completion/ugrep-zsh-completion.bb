SUMMARY = "Zsh completion for ugrep"
DESCRIPTION = " \
This package contains the zsh completion for ugrep."
LICENSE = "BSD-3-Clause"

PV = "7.8.4"

RPM_NAME = "ugrep-zsh-completion-7.8.4-1.1.noarch.rpm"
RPM_HASH = "febcc59186ee6720b861e97a24cb2a9926ab960010df5e3e54128691333a6a0707e317898ea6e091ff891d909a11e5c8530418cf5f5833fac2f3e6be5ff21dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ugrep-zsh-completion"

RDEPENDS:${PN} += "ugrep \
zsh"

inherit rpm
