SUMMARY = "Documentation for texlive-churchslavonic"
DESCRIPTION = "This package includes the documentation for texlive-churchslavonic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.4svn67474"

RPM_NAME = "texlive-churchslavonic-doc-2026.226.0.0.2.4svn67474-60.2.noarch.rpm"
RPM_HASH = "a193b2053e51c7d24e03eb7d23568a268c589e09609a7f3122b2852767bf2a854577a2697c7f4d4a6e5be754adabf4963e028dcd061fc9fdd606bbdc82e25732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-churchslavonic-doc-ru \
texlive-churchslavonic-doc"

RDEPENDS:${PN} += ""

inherit rpm
