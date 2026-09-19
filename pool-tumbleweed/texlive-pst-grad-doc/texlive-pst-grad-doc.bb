SUMMARY = "Documentation for texlive-pst-grad"
DESCRIPTION = "This package includes the documentation for texlive-pst-grad"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn77682"

RPM_NAME = "texlive-pst-grad-doc-2026.226.1.06svn77682-59.2.noarch.rpm"
RPM_HASH = "d0f9b55e17e90d2ba165dbc40251d39c120a555500e4ad7e7d10c5c6bf4aca7c9f253bffd31334af61724e13c4a4cd297ecfb3fc3ee90b2559b99f269e4883e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-grad-doc"

RDEPENDS:${PN} += ""

inherit rpm
