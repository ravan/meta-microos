SUMMARY = "Zsh Completion for fnott"
DESCRIPTION = "Zsh command-line completion support for fnott."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "fnott-zsh-completion-1.8.0-1.7.aarch64.rpm"
RPM_HASH = "650a047f63727068e80efc0a913ecf760a5711eefb29cc5f7d9ee112d6a3872a2f87e400535d16824bb5bd970ce666df14813bfc050d885aa6cce4660e9797e1"

RPROVIDES:${PN} += "fnott-zsh-completion"

RDEPENDS:${PN} += "fnott \
zsh"

inherit rpm
