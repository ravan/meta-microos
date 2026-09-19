SUMMARY = "Documentation for texlive-keycommand"
DESCRIPTION = "This package includes the documentation for texlive-keycommand"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1415svn78101"

RPM_NAME = "texlive-keycommand-doc-2026.226.3.1415svn78101-63.2.noarch.rpm"
RPM_HASH = "127440423572dfa458c90b893b05295ee0743e53f93d46a0c3d339e37d30f9c0ecc4aa13ed9fb5f16a4faf9fd93f3f36524a9b7dfcc459caaebabb2f64444d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keycommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
