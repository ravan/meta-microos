SUMMARY = "Documentation for texlive-frenchmath"
DESCRIPTION = "This package includes the documentation for texlive-frenchmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn71205"

RPM_NAME = "texlive-frenchmath-doc-2026.226.3.1svn71205-60.2.noarch.rpm"
RPM_HASH = "3e3e3b8eec656cf0b52e5705c6940b44d81dcd2bd65de6145410041ecd32f501e13de82cf143b1681156d747ebcadc7edc2fc6eaf9f1a7ed063aa5ba4eb0c4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-frenchmath-doc-fr \
texlive-frenchmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
