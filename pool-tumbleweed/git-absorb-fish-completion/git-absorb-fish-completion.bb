SUMMARY = "Fish Completion for git-absorb"
DESCRIPTION = "The official fish completion script for git-absorb, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "0.6.17"

RPM_NAME = "git-absorb-fish-completion-0.6.17-1.9.noarch.rpm"
RPM_HASH = "3dc25eeb6ffc8dbc1f5e82ace9048e0a2a8ece4137fb9a99146e6ea71b7ca32b8b1d69ae48b7f67dce8d0c8915c1edbb9396dcc3bc6e4489c641ccaf42361420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-absorb-fish-completion"

RDEPENDS:${PN} += "git-absorb"

inherit rpm
