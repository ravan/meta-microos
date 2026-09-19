SUMMARY = "Documentation for texlive-cmathbb"
DESCRIPTION = "This package includes the documentation for texlive-cmathbb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56414"

RPM_NAME = "texlive-cmathbb-doc-2026.226.1.0svn56414-60.2.noarch.rpm"
RPM_HASH = "ed51160ca6f05c022e86acd9fa2f9cd650b70514362d6f04a81b0645120afe8ad02842ab69e47a6960a50281fd1142f552f8cc5ae2fe23638165c40bf987460c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmathbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
