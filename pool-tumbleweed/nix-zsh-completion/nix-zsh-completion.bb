SUMMARY = "Zsh completion for nix"
DESCRIPTION = "Zsh command-line completion for the Nix package manager."
LICENSE = "LGPL-2.1-only"

PV = "2.35.2"

RPM_NAME = "nix-zsh-completion-2.35.2-1.1.noarch.rpm"
RPM_HASH = "1a122c8b5d16b794b68832094ca5b8c5c932b70b34c8e2a6fb0a893b3878544b18a1c057e3680cf5d637b98005e752a179faf20ed84e77c64bf4b1ce8142acc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nix-zsh-completion"

RDEPENDS:${PN} += "nix"

inherit rpm
