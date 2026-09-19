SUMMARY = "Documentation for texlive-mathdots"
DESCRIPTION = "This package includes the documentation for texlive-mathdots"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn77682"

RPM_NAME = "texlive-mathdots-doc-2026.226.0.0.9svn77682-59.2.noarch.rpm"
RPM_HASH = "6b28c1a7e552c6db37e1ba0716fc595710534467bdfa67eef1b4f8b7f3fdfb7bbd97f492b12846a5d36ed57d23eff1ea982b454e3c7ef5759bbe28ce493a3683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathdots-doc"

RDEPENDS:${PN} += ""

inherit rpm
