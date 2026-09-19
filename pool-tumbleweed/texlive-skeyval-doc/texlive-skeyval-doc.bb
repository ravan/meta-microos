SUMMARY = "Documentation for texlive-skeyval"
DESCRIPTION = "This package includes the documentation for texlive-skeyval"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn30560"

RPM_NAME = "texlive-skeyval-doc-2026.226.1.3svn30560-64.2.noarch.rpm"
RPM_HASH = "883a7dc89e1eba9d0c1fbdd3f76883a778baf2c72274e6a79cbd5f9eb20638a691a5bb838579cb7f70f16bc81960e627c74b37e88036a09a3208d7d9ad21e162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
