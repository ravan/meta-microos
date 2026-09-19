SUMMARY = "Zsh Completion for git-town"
DESCRIPTION = "zsh command line completion support for git-town."
LICENSE = "MIT"

PV = "24.0.0"

RPM_NAME = "git-town-zsh-completion-24.0.0-1.2.noarch.rpm"
RPM_HASH = "9aaf54206aac37613522e05d3862e5e77087e88d66e2964a8dee3f42ecf13ccc1035f5201e2e314adea8d77cdd62f8a0227d5b9358e14629418cf5cea451d667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-town-zsh-completion"

RDEPENDS:${PN} += "git-town \
zsh"

inherit rpm
