SUMMARY = "Documentation for texlive-germkorr"
DESCRIPTION = "This package includes the documentation for texlive-germkorr"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-germkorr-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "c23759eecbfb50f7011a2a891c205f525c615c0d55ccabb463f2af4b027d18cfe479bb60f6f254301d3a735ce63b35eec22828f9aca172fc71d3712f999c32aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-germkorr-doc"

RDEPENDS:${PN} += ""

inherit rpm
