SUMMARY = "Documentation for texlive-multibbl"
DESCRIPTION = "This package includes the documentation for texlive-multibbl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-multibbl-doc-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "f351ba3af40b9e623e33bbf756a676f8d3fcf5acb3ca3eb1bd393028fcf20477b694d47d5f6999319770390fc621cce2ce80c56dbea52acdfe30457ee314c8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
