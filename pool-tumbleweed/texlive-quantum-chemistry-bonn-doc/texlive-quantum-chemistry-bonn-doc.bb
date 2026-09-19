SUMMARY = "Documentation for texlive-quantum-chemistry-bonn"
DESCRIPTION = "This package includes the documentation for texlive-quantum-chemistry-bonn"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-quantum-chemistry-bonn-doc-2026.226.0.0.1svn76924-60.4.noarch.rpm"
RPM_HASH = "54ad3820a8b0c86a109eb65d0d41771e41aa75c2cf955637d2b829d78cde5ab81326d3a5da9ebc148c4070c35aad6695c5f9c819a9b1475a7c02101e25fd1f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantum-chemistry-bonn-doc"

RDEPENDS:${PN} += ""

inherit rpm
