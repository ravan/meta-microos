SUMMARY = "Zsh Completion for kubens"
DESCRIPTION = "zsh command line completion support for kubens."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubens-zsh-completion-0.11.0-2.3.noarch.rpm"
RPM_HASH = "0d9547979e26da4e28cd38684d7719886a6c8d20152f04dcb501f69383b1020db896e3c1f92679734545b82755867a64236fce159b1f623f89ad469c34c69e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubens-zsh-completion"

RDEPENDS:${PN} += "kubens \
zsh"

inherit rpm
