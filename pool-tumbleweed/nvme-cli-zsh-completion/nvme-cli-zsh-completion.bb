SUMMARY = "NVM Express user space tools zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "nvme-cli-zsh-completion-3.0+6.g1ac60ca4b-1.1.noarch.rpm"
RPM_HASH = "90252e4a615c913f32f43c8f56357d16c9e6bcb3acb3910b94a3ecf1691e2670dbcaca2b44ceb8a6f1de952ab2c3f889ac84e8acf1cd91e1a273e5b2faabc304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-zsh-completion"

RDEPENDS:${PN} += "nvme-cli \
zsh"

inherit rpm
