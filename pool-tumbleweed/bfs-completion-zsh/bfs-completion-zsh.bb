SUMMARY = "zsh completion for bfs"
DESCRIPTION = "bfs is a variant of the UNIX find command that operates breadth-first rather than depth-first. It is otherwise compatible with many versions of find. \
 \
This package holds the zsh completion for bfs."
LICENSE = "0BSD"

PV = "4.1.3"

RPM_NAME = "bfs-completion-zsh-4.1.3-1.1.noarch.rpm"
RPM_HASH = "f23cccc589826ce552416a4bafa3c878349b8d8c9b4351795b38690f3633b5424d22246c692bd1733ebd50b4437e9f24c809bed09f22b5db12a758534f94f23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bfs-completion-zsh"

RDEPENDS:${PN} += "bfs \
zsh"

inherit rpm
