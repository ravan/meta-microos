SUMMARY = "Documentation for texlive-zbmath-review-template"
DESCRIPTION = "This package includes the documentation for texlive-zbmath-review-template"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-doc-2026.226.2.1svn59693-59.4.noarch.rpm"
RPM_HASH = "5f524b0431f53e95261fc5e2693f9c581557f8977c438831727e7ff26ff0800af8fb2902d8dfc2043fc913ed5f332eb6fe14338b8d98d3bd3208f23e1f45f682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zbmath-review-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
