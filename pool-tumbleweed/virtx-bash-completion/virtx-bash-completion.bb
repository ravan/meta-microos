SUMMARY = "Bash Completion for virtx"
DESCRIPTION = "The official bash completion script for virtx, generated during the build."
LICENSE = "GPL-2.0-only"

PV = "0.1+gf3a7fda"

RPM_NAME = "virtx-bash-completion-0.1+gf3a7fda-1.1.noarch.rpm"
RPM_HASH = "2dfdc6c0556c79e7d083d00bfec826d78e8a4148cb617397da9c201ad109446c86990b6eed2a063fb1f15c13d6e6c8bb898f7a9a18bf3ab4ed52768e20124b4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virtx-bash-completion"

RDEPENDS:${PN} += "bash-completion \
virtx"

inherit rpm
