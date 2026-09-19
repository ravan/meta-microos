SUMMARY = "Documentation for texlive-neuralnetwork"
DESCRIPTION = "This package includes the documentation for texlive-neuralnetwork"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn31500"

RPM_NAME = "texlive-neuralnetwork-doc-2026.226.1.0svn31500-61.2.noarch.rpm"
RPM_HASH = "181a363ed2695e24799656148acda870c6411eec55e8f1644d38a39431d919452011d22316be82d019c274a9d064ddee99d9278e92ac23285765bbb0df80bbe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-neuralnetwork-doc"

RDEPENDS:${PN} += ""

inherit rpm
