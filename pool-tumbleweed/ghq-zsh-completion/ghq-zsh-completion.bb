SUMMARY = "Zsh Completion for ghq"
DESCRIPTION = "Zsh command line completion support for ghq."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "ghq-zsh-completion-1.10.1-1.1.noarch.rpm"
RPM_HASH = "03f054e64c7ab8a50fea85928974fd0523b95780e41cb314992852377e3d94501d6d07ff997a39bb99efed540754046db7a48aeb830e4e70a50ae32c047b81a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghq-zsh-completion"

RDEPENDS:${PN} += "ghq"

inherit rpm
