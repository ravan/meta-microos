SUMMARY = "Documentation for texlive-concmath-fonts"
DESCRIPTION = "This package includes the documentation for texlive-concmath-fonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17218"

RPM_NAME = "texlive-concmath-fonts-doc-2026.226.svn17218-60.2.noarch.rpm"
RPM_HASH = "04c986862ac2def9f48c2ab99f638afd4916e82fdfc4d373ce047f289406217d78d80e9efa596fec9f34504172df82d87eeb7dbe335f3bea596079519649f290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
