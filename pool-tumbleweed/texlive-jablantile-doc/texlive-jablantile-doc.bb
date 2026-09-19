SUMMARY = "Documentation for texlive-jablantile"
DESCRIPTION = "This package includes the documentation for texlive-jablantile"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn16364"

RPM_NAME = "texlive-jablantile-doc-2026.226.svn16364-63.2.noarch.rpm"
RPM_HASH = "23f1dd871994c755d9a70341e69f7fbd7271b309f5822b7e55a39defc065d70bdd63925e71c9ad922c9411e54e0f8fc21c0d3af327923308bd0b0fbe160ec150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jablantile-doc"

RDEPENDS:${PN} += ""

inherit rpm
