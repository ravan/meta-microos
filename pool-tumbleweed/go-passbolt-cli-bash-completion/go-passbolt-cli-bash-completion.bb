SUMMARY = "Bash Completion for go-passbolt-cli"
DESCRIPTION = "The official bash completion script for go-passbolt-cli, generated during the build."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "go-passbolt-cli-bash-completion-0.5.1-1.2.noarch.rpm"
RPM_HASH = "49d462b7b57852e0b5b9427e84f25cf1dabbe4ec5606b94c134e14118056f3b1ca998962dc99c6d1b370b23ddf98da4cbee6f6e76e1f4b10fa4d535e385355d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "go-passbolt-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
go-passbolt-cli"

inherit rpm
