SUMMARY = "Documentation for texlive-biblatex-license"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-license"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn58437"

RPM_NAME = "texlive-biblatex-license-doc-2026.226.0.0.1svn58437-61.2.noarch.rpm"
RPM_HASH = "1bf51634072a62298a90e4990968e4da85737b2b5c97c951c4c8208e1cf088480fe332ac718c37cd4e6815b02ff149953b399ea5a38bfe5025eecd96deb057d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-license-doc"

RDEPENDS:${PN} += ""

inherit rpm
