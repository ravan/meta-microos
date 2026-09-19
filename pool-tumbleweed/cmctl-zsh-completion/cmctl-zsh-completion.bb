SUMMARY = "Zsh Completion for cmctl"
DESCRIPTION = "zsh command line completion support for cmctl."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "cmctl-zsh-completion-2.5.0-1.4.noarch.rpm"
RPM_HASH = "e429c4dbb941de7ed755c511e0b9442fadaa024f762ecba2f163ac8e21f09bc07019f431691b329f3ab1a6a9abd8b22ac2ddb3c04a2f76cf95b12b2f23ca8465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmctl-zsh-completion"

RDEPENDS:${PN} += "cmctl"

inherit rpm
