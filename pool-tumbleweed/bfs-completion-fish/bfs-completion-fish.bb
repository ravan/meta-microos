SUMMARY = "Bash completion for bfs"
DESCRIPTION = "bfs is a variant of the UNIX find command that operates breadth-first rather than depth-first. It is otherwise compatible with many versions of find. \
 \
This package holds the fish completion for bfs."
LICENSE = "0BSD"

PV = "4.1.3"

RPM_NAME = "bfs-completion-fish-4.1.3-1.1.noarch.rpm"
RPM_HASH = "5c9bf72407b4e57ed6321d685878a9b912f43627d030c751c4a2b26d52db20e7a06f0613c25bdbee1d51554b7fa08cffacdb428537203af64b45b5b650d836a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bfs-completion-fish"

RDEPENDS:${PN} += "bfs \
fish"

inherit rpm
