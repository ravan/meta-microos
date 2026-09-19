SUMMARY = "Zsh Completion for zizmor"
DESCRIPTION = "zsh command line completion support for zizmor."
LICENSE = "MIT"

PV = "1.29.0"

RPM_NAME = "zizmor-zsh-completion-1.29.0-1.2.noarch.rpm"
RPM_HASH = "4d638f79e28c85b3e36073171503af437e66c7db5b2ab6a6c45d0e43b58687c666ec7d8875efc200f337cfe0c3a50e66fba37ff76ea787b845f4dca775571054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zizmor-zsh-completion"

RDEPENDS:${PN} += "zizmor \
zsh"

inherit rpm
