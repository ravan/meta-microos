SUMMARY = "Documentation for texlive-ascii-font"
DESCRIPTION = "This package includes the documentation for texlive-ascii-font"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-ascii-font-doc-2026.226.2.0svn77682-60.2.noarch.rpm"
RPM_HASH = "0a16471ee67c3b866a6275ee752d124b6e66aaf9e930441264c2815ceff31df365e6dcf407941c91b09dda27e593b1d93298c9be9b7e3fdc1d104a5463bf3986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascii-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
