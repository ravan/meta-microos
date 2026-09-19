SUMMARY = "Documentation for texlive-interfaces"
DESCRIPTION = "This package includes the documentation for texlive-interfaces"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn21474"

RPM_NAME = "texlive-interfaces-doc-2026.226.3.1svn21474-60.2.noarch.rpm"
RPM_HASH = "d4af12be3a69858ea090a1aad603d2922a109e818e4594eade4d38031590e1e186eaaded74d04744b4e3f8f5533c94ec5f186b08ad924cf72f9324168ebd4841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interfaces-doc"

RDEPENDS:${PN} += ""

inherit rpm
