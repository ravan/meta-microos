SUMMARY = "Zsh Completion for arkade"
DESCRIPTION = "zsh command line completion support for arkade."
LICENSE = "Apache-2.0"

PV = "0.11.125"

RPM_NAME = "arkade-zsh-completion-0.11.125-1.1.noarch.rpm"
RPM_HASH = "296e42c3b153f6b95d98c52784ac70a349d64bba6254ef96bc54b5c3bc55b2c6cef0d123239942a3d8636f546ba79141a2588fd132137d2cdc5a62c732d5cc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arkade-zsh-completion"

RDEPENDS:${PN} += "arkade"

inherit rpm
