SUMMARY = "Documentation for texlive-parskip"
DESCRIPTION = "This package includes the documentation for texlive-parskip"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0hsvn77682"

RPM_NAME = "texlive-parskip-doc-2026.226.2.0hsvn77682-58.2.noarch.rpm"
RPM_HASH = "0def8f7edfbf5a54928550e0d45b9b9d8c76dfa0ba921d0f2a47286861c5910db2aedaad93fb09ed57a203b89f534eaa653d956a8930e06761c92091220b940a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
