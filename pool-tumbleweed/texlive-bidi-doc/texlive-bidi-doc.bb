SUMMARY = "Documentation for texlive-bidi"
DESCRIPTION = "This package includes the documentation for texlive-bidi"
LICENSE = "LPPL-1.0"

PV = "2026.226.26.01.08svn77682"

RPM_NAME = "texlive-bidi-doc-2026.226.26.01.08svn77682-61.2.noarch.rpm"
RPM_HASH = "16484ec05c80897c321d1fb1ee6db067477d2ae6f5f5fe579a4ca43a214c753fd6e3ce12f4dd7c3e177da5db62bac85fe2e9077553516762ddfec0abcc77376e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
