SUMMARY = "Zsh Completion for holos"
DESCRIPTION = "zsh command line completion support for holos."
LICENSE = "Apache-2.0"

PV = "0.106.0"

RPM_NAME = "holos-zsh-completion-0.106.0-1.6.noarch.rpm"
RPM_HASH = "0f3cc262d4a4dc9365d39f85066b7d8cc49b8e7fe331e22d74bc5d3f882c5391c66f5ca775b7e3a2415362f2299e83ea23e44a664422d0fba198e98df2ba2e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "holos-zsh-completion"

RDEPENDS:${PN} += "holos \
zsh"

inherit rpm
