SUMMARY = "Documentation for texlive-sourcesanspro"
DESCRIPTION = "This package includes the documentation for texlive-sourcesanspro"
LICENSE = "OFL-1.1"

PV = "2026.226.2.8svn77682"

RPM_NAME = "texlive-sourcesanspro-doc-2026.226.2.8svn77682-64.2.noarch.rpm"
RPM_HASH = "8062b42464144f7b069527d683762cbe3c975076ec4420b85fb7ccb9be4b59550bea9dd2e9cfab48e5c48aef035e71c515f8d6e55755d3e5999ac2fe9d9a5972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourcesanspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
