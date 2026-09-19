SUMMARY = "Documentation for texlive-bookhands"
DESCRIPTION = "This package includes the documentation for texlive-bookhands"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-bookhands-doc-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "f4afb25d42358488c73d140f92104e495bcd20663357fb0725188ef8311721ceb2fbadad6658063ca085d14f8bf993197000bb784664eb2e6fbd47dad5594187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookhands-doc"

RDEPENDS:${PN} += ""

inherit rpm
