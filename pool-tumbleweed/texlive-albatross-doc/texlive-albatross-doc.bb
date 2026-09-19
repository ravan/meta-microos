SUMMARY = "Documentation for texlive-albatross"
DESCRIPTION = "This package includes the documentation for texlive-albatross"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.5.1svn73436"

RPM_NAME = "texlive-albatross-doc-2026.226.0.0.5.1svn73436-61.2.noarch.rpm"
RPM_HASH = "25b59b423f7e85ee7ea417725d8eab13f3ad13cad66ffe2f9c7fffd7319dc6bbcbddac31d06e16f1d6f1148f0faf4aab1e9a442be84e083b99b4ff33afb946e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-albatross.1 \
texlive-albatross-doc"

RDEPENDS:${PN} += ""

inherit rpm
