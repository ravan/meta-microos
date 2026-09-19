SUMMARY = "Zsh Completion for python-magic-wormhole"
DESCRIPTION = "Zsh command-line completion support for python-magic-wormhole."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python-magic-wormhole-zsh-completion-0.24.0-2.1.noarch.rpm"
RPM_HASH = "05f3b3ca64199018dd82a5c7c52432699b028d997b1099480fc754d622566ef4c6c1a0e297786f00f7750960e9e06d7ac4ef20a992db89e2f6afc2278fa76dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-magic-wormhole-zsh-completion"

RDEPENDS:${PN} += "python3dist-magic-wormhole \
zsh"

inherit rpm
