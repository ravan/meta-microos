SUMMARY = "Documentation for texlive-pst-2dplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-2dplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-pst-2dplot-doc-2026.226.1.5svn15878-59.2.noarch.rpm"
RPM_HASH = "865dbb7e39abd4c6296462283e742430b6aeabbe02324ea3747ad4916adcbd110c216d123e8a93cc15e7ee6b8b97bc0b891d35f7a6d80240a91d97432bd7e37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-2dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
