SUMMARY = "ZSH completion for dust"
DESCRIPTION = "ZSH completion script for dust."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "dust-zsh-completion-1.2.5-1.2.noarch.rpm"
RPM_HASH = "c472108002ad6fa9f35209789668e33e1d3d7125a9b8ed359e097fde42c6c30195da5065a1e048ff2f6e7ffbc64528eac8456b8b5f7e6a7be4ba1bbbf57f529b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
