SUMMARY = "Fish Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the fish completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "borgbackup-fish-completion-1.4.5-1.1.noarch.rpm"
RPM_HASH = "788a08ec31baf1ba4d92c760bd1f79c499f7616a48f5722be395ee2575782db3996e51f70938d28ae1dc1c34380d5928d50a9c39753976a7c2419248b56f888a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-fish-completion"

RDEPENDS:${PN} += "borgbackup \
fish"

inherit rpm
