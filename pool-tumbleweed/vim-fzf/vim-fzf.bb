SUMMARY = "Vim plugin for fzf"
DESCRIPTION = "Plugin for vim allowing use of fzf."
LICENSE = "MIT"

PV = "0.74.3"

RPM_NAME = "vim-fzf-0.74.3-1.1.noarch.rpm"
RPM_HASH = "8a664aabae26da8700a245df5ac46379790c16c21ba9ec7cfcce8e77d2e495eb047039c6556288be79ccef4d6d832c766a9e7d3b6eeba010b40229241155e893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-fzf"

RDEPENDS:${PN} += ""

inherit rpm
