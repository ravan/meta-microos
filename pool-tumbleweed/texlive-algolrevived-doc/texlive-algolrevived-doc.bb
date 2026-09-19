SUMMARY = "Documentation for texlive-algolrevived"
DESCRIPTION = "This package includes the documentation for texlive-algolrevived"
LICENSE = "OFL-1.1"

PV = "2026.226.1.054svn77682"

RPM_NAME = "texlive-algolrevived-doc-2026.226.1.054svn77682-61.2.noarch.rpm"
RPM_HASH = "67bf1aafe292582ad6d17d2101933815d38b86fe9250c9495831770d2210aa81e8241bf1d4147af59eb49f4df5b52598de4da635fbc0ee555f9cff4cb131bde8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algolrevived-doc"

RDEPENDS:${PN} += ""

inherit rpm
