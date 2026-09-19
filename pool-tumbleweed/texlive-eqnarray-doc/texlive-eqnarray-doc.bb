SUMMARY = "Documentation for texlive-eqnarray"
DESCRIPTION = "This package includes the documentation for texlive-eqnarray"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-eqnarray-doc-2026.226.1.3svn77682-61.4.noarch.rpm"
RPM_HASH = "ab01c40c74d3005c2d52124c6defd840179a948ba9476d17067d5a4e99b9bfae3b26dccf82c9928e2586fe9ae67752b88abc0aec5bee7e890dc6ea6527ae60d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
