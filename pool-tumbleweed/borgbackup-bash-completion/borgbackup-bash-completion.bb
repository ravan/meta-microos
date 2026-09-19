SUMMARY = "Bash Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the bash completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "borgbackup-bash-completion-1.4.5-1.1.noarch.rpm"
RPM_HASH = "e6b7ff91e6bf9ab696db05598226b3559551ba3192579ba57ede353d2d3584ae7c5ee2db9c8982dea6622008a42240fc665694d70fb5d383c89c7e7f9a8cf948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-bash-completion"

RDEPENDS:${PN} += "bash-completion \
borgbackup"

inherit rpm
