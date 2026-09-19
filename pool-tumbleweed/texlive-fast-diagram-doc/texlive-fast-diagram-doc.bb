SUMMARY = "Documentation for texlive-fast-diagram"
DESCRIPTION = "This package includes the documentation for texlive-fast-diagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn29264"

RPM_NAME = "texlive-fast-diagram-doc-2026.226.1.1svn29264-59.2.noarch.rpm"
RPM_HASH = "4ed8af7baa7cf2e8aa45b0ce03e84ac80dc3145ba40458d620f17f8beeeeb4f2fd0efbe1ec7f9f979d58a2bcb1e990736afa51b6e83710bac56b5083c65096bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fast-diagram-doc-fr \
texlive-fast-diagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
