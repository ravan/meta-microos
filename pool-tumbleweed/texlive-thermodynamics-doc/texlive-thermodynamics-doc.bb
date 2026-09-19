SUMMARY = "Documentation for texlive-thermodynamics"
DESCRIPTION = "This package includes the documentation for texlive-thermodynamics"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.03svn77280"

RPM_NAME = "texlive-thermodynamics-doc-2026.227.2.03svn77280-62.2.noarch.rpm"
RPM_HASH = "95526bbf1eb41c69311c2816bb584f2c5d6a53c8a8ceef54421f3c86458062c6cdd277e0b573564191ff9ee1d5e9b1ce234f0c9c01379bf7a0ecbde7d4ef3ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thermodynamics-doc"

RDEPENDS:${PN} += ""

inherit rpm
