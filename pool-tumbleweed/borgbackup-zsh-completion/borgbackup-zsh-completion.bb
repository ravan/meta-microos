SUMMARY = "Zsh Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the zsh completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "borgbackup-zsh-completion-1.4.5-1.1.noarch.rpm"
RPM_HASH = "9a57aa2658d298fd40b8122023b554936b54a6b3b63154a04416f94d2c603ce0c38cbf7271517d62496b92f84144997af0a2ab764ed03081d0c88a27885c33d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-zsh-completion"

RDEPENDS:${PN} += "borgbackup \
zsh"

inherit rpm
