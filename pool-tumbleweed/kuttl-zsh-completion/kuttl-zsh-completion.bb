SUMMARY = "Zsh Completion for kuttl"
DESCRIPTION = "zsh command line completion support for kuttl."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "kuttl-zsh-completion-0.26.0-1.4.noarch.rpm"
RPM_HASH = "50a23b8ed1819e78568cb4731492776733dbb521f250ceae1e4aed287b2a93ff4c3b7066c78d6ed152c105865b59265cc2e91df713bb08ddcf898cc809ef6fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuttl-zsh-completion"

RDEPENDS:${PN} += "kuttl"

inherit rpm
