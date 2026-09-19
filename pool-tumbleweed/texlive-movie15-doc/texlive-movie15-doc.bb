SUMMARY = "Documentation for texlive-movie15"
DESCRIPTION = "This package includes the documentation for texlive-movie15"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn26473"

RPM_NAME = "texlive-movie15-doc-2026.226.svn26473-61.2.noarch.rpm"
RPM_HASH = "c8f3e4a318afa6fff024626d32829bd2ff7ae41e00f9c5832ceaaa336b050ec89ff0ccb4ed566caa05add964dfc488e49d55d654df286185a1ff2f96afb34886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-movie15-doc"

RDEPENDS:${PN} += ""

inherit rpm
