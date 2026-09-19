SUMMARY = "Zsh Completion for teleport-tbot"
DESCRIPTION = "zsh command line completion support for teleport-tbot."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-tbot-zsh-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "d0bda1ae27cde29f70bfa423ef06a192d31258de6a795f9b566f6eb39c92a9dbbaccd1e8b06a82da35a9cb39479d667d6d909247a6979c71add504ed3f871c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-tbot-zsh-completion"

RDEPENDS:${PN} += "teleport-tbot"

inherit rpm
