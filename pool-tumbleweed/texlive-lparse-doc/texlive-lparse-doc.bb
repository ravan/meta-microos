SUMMARY = "Documentation for texlive-lparse"
DESCRIPTION = "This package includes the documentation for texlive-lparse"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn78101"

RPM_NAME = "texlive-lparse-doc-2026.226.0.0.3.0svn78101-61.2.noarch.rpm"
RPM_HASH = "57af1853212033620cf5603d7442a9ba3d4623944bb4b1fd7f5bd925b0739750d08f93d07f113c927eb77215affcab587240ae851fe3c02348e1734d9dc46e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
