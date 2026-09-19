SUMMARY = "Fish completion for nix"
DESCRIPTION = "Fish command-line completion for the Nix package manager."
LICENSE = "LGPL-2.1-only"

PV = "2.35.2"

RPM_NAME = "nix-fish-completion-2.35.2-1.1.noarch.rpm"
RPM_HASH = "e54e4aa1b008d8396d17ebeb25727e45367b009fd4067dbf50e7015bd07a6a36efbe75ad27c3c17b1c1818f0a2398359f2c4c286e14b724a19e017f607b044ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nix-fish-completion"

RDEPENDS:${PN} += "nix"

inherit rpm
