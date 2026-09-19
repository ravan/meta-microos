SUMMARY = "Documentation for texlive-pgf-interference"
DESCRIPTION = "This package includes the documentation for texlive-pgf-interference"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-pgf-interference-doc-2026.226.0.0.1svn76924-58.2.noarch.rpm"
RPM_HASH = "fb92a0a3a53bd9884ebd5c20928b38f105a2c1bc29151d3793367d91602285bf58ef5e8ced01ba8a2aedac1eea3cb8c5b70828e23a706042ab5d135416767be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pgf-interference-doc-de;en \
texlive-pgf-interference-doc"

RDEPENDS:${PN} += ""

inherit rpm
