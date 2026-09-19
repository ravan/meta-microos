SUMMARY = "Documentation for texlive-harpoon"
DESCRIPTION = "This package includes the documentation for texlive-harpoon"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn21327"

RPM_NAME = "texlive-harpoon-doc-2026.226.1.0svn21327-60.4.noarch.rpm"
RPM_HASH = "563cd7e2497bd40a90704bb6b953078a27d8e3afbd847a56ffe5d4f8f3fc7eb2c6cc3f824857c1c50382c3c579132a13496a6453097e43875ec9ca7d03a6bb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harpoon-doc"

RDEPENDS:${PN} += ""

inherit rpm
