SUMMARY = "Documentation for texlive-readablecv"
DESCRIPTION = "This package includes the documentation for texlive-readablecv"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn76790"

RPM_NAME = "texlive-readablecv-doc-2026.226.4.0svn76790-60.4.noarch.rpm"
RPM_HASH = "d46f131d5ea14e283c8080d80638a81f6a08ba53c8f4ec1b79368269dd2db1fcc73706bfe4e14a86c03f38af0ce97bde2ec90be6d8f83c3149ea2e220a98de5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readablecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
