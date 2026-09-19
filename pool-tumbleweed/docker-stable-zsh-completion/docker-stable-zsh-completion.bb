SUMMARY = "Zsh Completion for docker-stable"
DESCRIPTION = "Zsh command line completion support for docker-stable."
LICENSE = "Apache-2.0"

PV = "24.0.9_ce"

RPM_NAME = "docker-stable-zsh-completion-24.0.9_ce-19.3.noarch.rpm"
RPM_HASH = "e1cb1e5237a0a0373e3f8496b8d998cb27a79347a3aaa26ca1d36fe07af014303f899d5101d2fc0a5349412580c083c5d942a7e7cbc237d313f6e7ed56a00884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-stable-zsh-completion \
docker-zsh-completion"

RDEPENDS:${PN} += "docker-stable \
zsh"

inherit rpm
