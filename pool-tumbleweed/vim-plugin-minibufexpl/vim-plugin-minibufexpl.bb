SUMMARY = "Elegant buffer explorer that takes very little screen space"
DESCRIPTION = "Minibufexplorer allows to quickly switch buffers by double-clicking the \
appropriate 'tab'. Tabs get updated as buffers are opened and closed. \
Buffers that are modified get visually marked and buffers that are open in a \
window get visually marked."
LICENSE = "ISC"

PV = "6.3.2"

RPM_NAME = "vim-plugin-minibufexpl-6.3.2-64.2.noarch.rpm"
RPM_HASH = "e89c933bbf4550c2c2672bdb5157cf7b31e6d097d6e5e70103d124bb0ff520211d3ea6f3e1483fc26384534feb768c5323aa2c1f704e5312a885c4a6c3c8da42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-minibufexpl"

RDEPENDS:${PN} += "vim"

inherit rpm
