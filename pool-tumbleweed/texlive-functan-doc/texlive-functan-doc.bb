SUMMARY = "Documentation for texlive-functan"
DESCRIPTION = "This package includes the documentation for texlive-functan"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-functan-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "c61d0d055585c285a6ed87a9b438e87294a0ec0c146fcc273d161bb063faddc0ee1e5d8c23c0aaf6d8d94bcd0f2b46cc95aa7a317b3b0aefa0eccaf6b6e4ddd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-functan-doc"

RDEPENDS:${PN} += ""

inherit rpm
