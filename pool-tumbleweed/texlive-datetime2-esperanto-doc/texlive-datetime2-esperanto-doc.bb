SUMMARY = "Documentation for texlive-datetime2-esperanto"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-esperanto"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47356"

RPM_NAME = "texlive-datetime2-esperanto-doc-2026.226.1.1svn47356-59.2.noarch.rpm"
RPM_HASH = "6df9c0d9366ec6c9cbc201417d7fbe9c5f64affb74134b06fc34652006e27ad37f7179c0e8db2ac96e2ead9e0aeefcd1ff6e683a9ab49aac4b9f3f0548d9f6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-esperanto-doc"

RDEPENDS:${PN} += ""

inherit rpm
