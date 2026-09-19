SUMMARY = "Documentation for texlive-cm-super"
DESCRIPTION = "This package includes the documentation for texlive-cm-super"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cm-super-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "9d9a5972921679638647fdf49b890caaca15e00657575be90b47f3d949d7f063c6c8e9851048fbe7a16abc1f2afb9e3776e50dda4c822b3f02fa25294f340287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-super-doc"

RDEPENDS:${PN} += ""

inherit rpm
