SUMMARY = "Documentation for texlive-lydtype"
DESCRIPTION = "This package includes the documentation for texlive-lydtype"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-lydtype-doc-2026.226.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "30fe4fcec40c709d1e5e2e72c461c65492a01a2e921acec282773cd3be5766be4dbca14a53a55a3581d711d995ad51e91a339a5bc9cd070cdbd2cbdaf6851f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lydtype-doc"

RDEPENDS:${PN} += ""

inherit rpm
