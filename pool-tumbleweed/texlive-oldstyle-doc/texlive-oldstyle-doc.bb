SUMMARY = "Documentation for texlive-oldstyle"
DESCRIPTION = "This package includes the documentation for texlive-oldstyle"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-oldstyle-doc-2026.226.0.0.2svn15878-61.2.noarch.rpm"
RPM_HASH = "3255bb07a1c3597fe5000ec147ee85c7e2acec453bd1daa933b9965d6ae4dea6c376b9c13a49a53819fdea6842c93d4e9c3a084fadb59397b964a279b8564f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
