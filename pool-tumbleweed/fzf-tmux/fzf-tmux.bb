SUMMARY = "Tmux integration for fzf"
DESCRIPTION = "Tmux integration for fzf. Includes a wrapper script, fzf-tmux, that opens your list in a \
separate tmux pane."
LICENSE = "MIT"

PV = "0.74.3"

RPM_NAME = "fzf-tmux-0.74.3-1.1.noarch.rpm"
RPM_HASH = "378e7de1d3ea89c30b35b18347f5c2319374bcade1afae7e2df3ad3dbe9c8dad3c17c066d016992246e2092871bc3d968413294bf438964bff7989148ec4ee91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-tmux"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
