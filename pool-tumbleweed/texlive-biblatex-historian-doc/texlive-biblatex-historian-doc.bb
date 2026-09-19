SUMMARY = "Documentation for texlive-biblatex-historian"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-historian"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn19787"

RPM_NAME = "texlive-biblatex-historian-doc-2026.226.0.0.4svn19787-61.2.noarch.rpm"
RPM_HASH = "93527f399ba9847b5910611f1a0d418f5c6a0e6fd6e970b52f02ae24382b7e3cdf2879cace16e120215de4f09447ffc192140ebcc4adef6b579768e421c8b052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-historian-doc"

RDEPENDS:${PN} += ""

inherit rpm
