SUMMARY = "Zsh Completion for werf"
DESCRIPTION = "zsh command line completion support for werf."
LICENSE = "Apache-2.0"

PV = "2.75.3"

RPM_NAME = "werf-zsh-completion-2.75.3-1.1.noarch.rpm"
RPM_HASH = "9b991c7327b753377f03551bccafbfb746fd0c8926c87acdd4775c02fa373135f92206cde30ff94b2d4fa9de42eae5b79e7b660f5b5a1916696bb312c57c6584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "werf-zsh-completion"

RDEPENDS:${PN} += "werf"

inherit rpm
