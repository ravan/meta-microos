SUMMARY = "Documentation for texlive-epspdfconversion"
DESCRIPTION = "This package includes the documentation for texlive-epspdfconversion"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-doc-2026.226.0.0.61svn18703-61.4.noarch.rpm"
RPM_HASH = "007ee6eb6ade2c7406e6a16967dd42912330807fccfae8a29e012e26d4c84a5b93c75346fe63a2d96f74e7bf43accbd2c38c75d9bc1b4961c46e38b712b2fc41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdfconversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
