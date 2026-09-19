SUMMARY = "ZSH Completion for yazi"
DESCRIPTION = "The official zsh completion script for yazi."
LICENSE = "MIT"

PV = "26.8.15"

RPM_NAME = "yazi-zsh-completion-26.8.15-1.2.noarch.rpm"
RPM_HASH = "c0232cdd1ec112edfd80f29936a8a6d04a57db3ed439af699234ee504d2d5c8a27c98aa82467495997e483cef2d8d30dfba16e7ec4206c3c88d30b5a92117325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yazi-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
