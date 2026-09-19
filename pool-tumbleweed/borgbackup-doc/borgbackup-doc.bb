SUMMARY = "Documentation files for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
Run borg for a commands overview and check out the docs at \
/usr/share/doc/packages/borgbackup/html/index.html."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "borgbackup-doc-1.4.5-1.1.noarch.rpm"
RPM_HASH = "a85b364b2fc68c0879fbeb30975bd99e801016365d93b5c00ef148fcd1578f9f7ca3215e9bfa3da1932562aae4c272d57913d2d93d64d765c7e7c3a43fbd79ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-doc"

RDEPENDS:${PN} += ""

inherit rpm
