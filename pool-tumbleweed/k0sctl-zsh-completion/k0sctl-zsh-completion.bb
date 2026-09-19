SUMMARY = "Zsh Completion for k0sctl"
DESCRIPTION = "zsh command line completion support for k0sctl."
LICENSE = "Apache-2.0"

PV = "0.32.2"

RPM_NAME = "k0sctl-zsh-completion-0.32.2-1.1.noarch.rpm"
RPM_HASH = "26879c329dad85e883da544f8e7c1148414e5fbf8732ca90e69fb377e82c534ba7277859a9236456609bc7718244e7ee3bf543373470b2ee021fd1a2be97246d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k0sctl-zsh-completion"

RDEPENDS:${PN} += "k0sctl"

inherit rpm
