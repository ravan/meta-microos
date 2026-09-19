SUMMARY = "Bash completion for bfs"
DESCRIPTION = "bfs is a variant of the UNIX find command that operates breadth-first rather than depth-first. It is otherwise compatible with many versions of find. \
 \
This package holds the bash completion for bfs."
LICENSE = "0BSD"

PV = "4.1.3"

RPM_NAME = "bfs-completion-bash-4.1.3-1.1.noarch.rpm"
RPM_HASH = "6cb6ec8bd4da33f688322157e3eebbba508f2fb0eca0e884c3b151bf474464045dd2e7db051a68db41388389fc0f84d5e7b66dd1e1ccb538a5bbb26a0608812f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bfs-completion-bash"

RDEPENDS:${PN} += "bash \
bfs"

inherit rpm
