SUMMARY = "ZSH Completion for hut"
DESCRIPTION = "The official zsh completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "hut-zsh-completion-0.8.0-1.4.noarch.rpm"
RPM_HASH = "8e927b4706ff39201785c87c2e87e96827cf688fd91df5bb735888137c83d88c0867bc512c2919acf65acfa8fe870ba3fecf955d78901e68a22bd7b10bfc1f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
