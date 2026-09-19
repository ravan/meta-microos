SUMMARY = "ZSH Completion for mcphost"
DESCRIPTION = "The official zsh completion script for mcphost, generated during the build."
LICENSE = "MIT & Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.34.0"

RPM_NAME = "mcphost-zsh-completion-0.34.0-10.1.noarch.rpm"
RPM_HASH = "0f59f137c9051e9614158df9b87817840cb70d13bb328825116fb54572fc54e219fb558e665da6d1fbdc880fac7d6ed8b48fa1dc54a3c3bd14465b49c4d70e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcphost-zsh-completion"

RDEPENDS:${PN} += "mcphost"

inherit rpm
