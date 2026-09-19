SUMMARY = "Zsh Completion for fuzzel"
DESCRIPTION = "Zsh command-line completion support for fuzzel"
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "fuzzel-zsh-completion-1.14.0-1.7.aarch64.rpm"
RPM_HASH = "a340cb9b60a9f6e3faa07eb79d76a6a6361cd6068e24665606512268bccd4c3781ead705da364ca58120a4f0f0b02671cdd3f79734574e457c12c7d5d5148daf"

RPROVIDES:${PN} += "fuzzel-zsh-completion"

RDEPENDS:${PN} += "fuzzel \
zsh"

inherit rpm
