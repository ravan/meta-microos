SUMMARY = "Zsh Completion for velero"
DESCRIPTION = "Zsh command line completion support for velero."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "velero-zsh-completion-1.18.2-1.3.noarch.rpm"
RPM_HASH = "3bf229b1e90413e624869017f69299bbd2a259a521c64c2cfb62c7b3ba3135751b2df26518d218260e4ca21353221997327b78144ab9403bdbdca9fe0e0ae330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velero-zsh-completion"

RDEPENDS:${PN} += "velero"

inherit rpm
