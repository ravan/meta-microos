SUMMARY = "Zsh completion for github-mcp-server"
DESCRIPTION = "Zsh command line completion support for github-mcp-server."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "github-mcp-server-zsh-completion-1.12.1-1.1.noarch.rpm"
RPM_HASH = "dccc714a000b15356eb9e0b3f17f81b3d0feac2d1ebde3f91630df25f4b119840ca9fd3fe7a822cd632b10efd1d8fd7498f5c327a9c68ac4d0c5c055a0e596e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "github-mcp-server-zsh-completion"

RDEPENDS:${PN} += "github-mcp-server"

inherit rpm
