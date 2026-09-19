SUMMARY = "Documentation for texlive-nl-interval"
DESCRIPTION = "This package includes the documentation for texlive-nl-interval"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn58328"

RPM_NAME = "texlive-nl-interval-doc-2026.226.1.0svn58328-61.2.noarch.rpm"
RPM_HASH = "45435fa38bb804e3035ad79f3671e58938f92920a48ea6eecdb6afa634c9c209577af446b1aae050bf4b0e2184a154ea98c4f972ea49953818252ca617cb85fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nl-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
