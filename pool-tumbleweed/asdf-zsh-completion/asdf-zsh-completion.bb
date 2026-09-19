SUMMARY = "Zsh Completion for asdf"
DESCRIPTION = "Zsh command line completion support for asdf."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "asdf-zsh-completion-0.20.0-1.2.noarch.rpm"
RPM_HASH = "f94ef9d7f0d77e9b529e1a0e6c5a49060d80881fae6713b5f0f78fa3c148dbcf00677f2b9cbd66eb5d674d52f976dff0b1a9adbd339c2385eb513051096cc3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asdf-zsh-completion"

RDEPENDS:${PN} += "asdf"

inherit rpm
