SUMMARY = "Documentation for texlive-yb-book"
DESCRIPTION = "This package includes the documentation for texlive-yb-book"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.5svn74649"

RPM_NAME = "texlive-yb-book-doc-2026.226.0.0.6.5svn74649-59.4.noarch.rpm"
RPM_HASH = "3dce4c31f487ac80ed90e3cf21cfaa3ab6376d18191b15183ba2c47026de516a973dc4371d20ea569e9016be65c6212eab2179fad408c581cb0528dd62d9a95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yb-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
