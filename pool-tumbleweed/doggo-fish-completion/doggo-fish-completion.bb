SUMMARY = "fish completion for doggo"
DESCRIPTION = "fish completion scripts for doggo"
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "doggo-fish-completion-1.3.0-1.1.noarch.rpm"
RPM_HASH = "1965ed7876212298369f7d0dce2d6940f871ede05186e98b6150e946f5b2dbdee9be3389a351a46c12e83d85797c42c056af08d70f8a0b43539e3d470e934a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "doggo-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
