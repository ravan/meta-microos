SUMMARY = "Documentation for texlive-bankstatement"
DESCRIPTION = "This package includes the documentation for texlive-bankstatement"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.2svn75301"

RPM_NAME = "texlive-bankstatement-doc-2026.226.0.0.9.2svn75301-60.2.noarch.rpm"
RPM_HASH = "10b72f75e1fcebab43c8a6807f6cf835dcf6ca1ae49b1e4bcb53fdd9f931efd5e958881fc4e688e99bd9043ed998da40c359db19fad74cce2c72efb51bc591b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bankstatement-doc"

RDEPENDS:${PN} += ""

inherit rpm
