SUMMARY = "Fish Completion for yazi"
DESCRIPTION = "The official fish completion script for yazi."
LICENSE = "MIT"

PV = "26.8.15"

RPM_NAME = "yazi-fish-completion-26.8.15-1.2.noarch.rpm"
RPM_HASH = "2528c6c965644faa24a66bb33732e2d24f0f400d38588523511637b25073b56380f313825ba4c3dcbe93317e2488d01a61d0ef1f27d56f1b91ac75d59583c2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yazi-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
