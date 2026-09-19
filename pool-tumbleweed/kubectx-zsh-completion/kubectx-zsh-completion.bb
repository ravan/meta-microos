SUMMARY = "Zsh Completion for kubectx"
DESCRIPTION = "zsh command line completion support for kubectx."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubectx-zsh-completion-0.11.0-1.5.noarch.rpm"
RPM_HASH = "73c6d536c36e820c0af832a25541c3841d9bd6cca532a037bb3089c1277a76948b447a20ccc67e8bebea49d69eb59fb89fa59f65715887baf6e8939be122ade1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectx-zsh-completion"

RDEPENDS:${PN} += "kubectx \
zsh"

inherit rpm
