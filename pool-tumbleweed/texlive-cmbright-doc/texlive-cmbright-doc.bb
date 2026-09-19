SUMMARY = "Documentation for texlive-cmbright"
DESCRIPTION = "This package includes the documentation for texlive-cmbright"
LICENSE = "LPPL-1.0"

PV = "2026.226.8.1svn77682"

RPM_NAME = "texlive-cmbright-doc-2026.226.8.1svn77682-60.2.noarch.rpm"
RPM_HASH = "5d57f4b965ddaa6161059245fc67cdceeea5058818fb760518ed971def7ad523d5bd24ee07fa6092cac09d5a9612995dfb0c383315f2e5285c63892c3e651368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmbright-doc"

RDEPENDS:${PN} += ""

inherit rpm
