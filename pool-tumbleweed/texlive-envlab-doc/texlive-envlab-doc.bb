SUMMARY = "Documentation for texlive-envlab"
DESCRIPTION = "This package includes the documentation for texlive-envlab"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn61937"

RPM_NAME = "texlive-envlab-doc-2026.226.1.2svn61937-61.4.noarch.rpm"
RPM_HASH = "bf6303a032ea4715b0f0afa5a0352ada5c627db883a97e5d98651fca6fc30d9da78ba1e15bacad120bf3489a09a9ed4c05577b90f619c74ee9f63333ac76c4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envlab-doc"

RDEPENDS:${PN} += ""

inherit rpm
