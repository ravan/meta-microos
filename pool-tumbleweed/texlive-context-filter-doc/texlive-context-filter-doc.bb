SUMMARY = "Documentation for texlive-context-filter"
DESCRIPTION = "This package includes the documentation for texlive-context-filter"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn62070"

RPM_NAME = "texlive-context-filter-doc-2026.226.svn62070-61.2.noarch.rpm"
RPM_HASH = "f97594dc7dd78ea1a46548acec98398e5414de3c15956bb131079f6193b82d9f038c103d616cc0c140df9414076ea9f1bd189730047f3a71d18867d85fe901d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-filter-doc"

RDEPENDS:${PN} += ""

inherit rpm
