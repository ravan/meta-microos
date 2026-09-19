SUMMARY = "Documentation for texlive-thesis-titlepage-fhac"
DESCRIPTION = "This package includes the documentation for texlive-thesis-titlepage-fhac"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn15878"

RPM_NAME = "texlive-thesis-titlepage-fhac-doc-2026.227.0.0.1svn15878-62.2.noarch.rpm"
RPM_HASH = "f130a8de2b27f8b46366b2741bfd794afe2afeb82a44276e8ab8d76364bd6947e402037aacd1a091a3b88bf2c980ce04f2e709959a7c12775e5053636c9e4ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thesis-titlepage-fhac-doc"

RDEPENDS:${PN} += ""

inherit rpm
