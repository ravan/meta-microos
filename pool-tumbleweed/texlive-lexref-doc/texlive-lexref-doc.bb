SUMMARY = "Documentation for texlive-lexref"
DESCRIPTION = "This package includes the documentation for texlive-lexref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn36026"

RPM_NAME = "texlive-lexref-doc-2026.226.1.1asvn36026-61.2.noarch.rpm"
RPM_HASH = "49828929d2b488feb1824dda48cafaf47ccac38a614148fd9e37cdd122e6c7a7ed04c659e55ee21c436a2c5979de6eab25646a8c83d525e670ad0cbed4764a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexref-doc"

RDEPENDS:${PN} += ""

inherit rpm
