SUMMARY = "Documentation for texlive-pdfwin"
DESCRIPTION = "This package includes the documentation for texlive-pdfwin"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn68667"

RPM_NAME = "texlive-pdfwin-doc-2026.226.svn68667-58.2.noarch.rpm"
RPM_HASH = "f7a1aa727e414c580f860bdf87ba951844b5c6a89cc19098d0ec6c7034666ed8bc3725f5e1e454e0032d131c084bfd7e14184b2d0493d385bf002b2792371254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfwin-doc"

RDEPENDS:${PN} += ""

inherit rpm
