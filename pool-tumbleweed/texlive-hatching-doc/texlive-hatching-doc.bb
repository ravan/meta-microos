SUMMARY = "Documentation for texlive-hatching"
DESCRIPTION = "This package includes the documentation for texlive-hatching"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.11svn23818"

RPM_NAME = "texlive-hatching-doc-2026.226.0.0.11svn23818-60.4.noarch.rpm"
RPM_HASH = "1efcea72eb17d11489eab9eea82761b0f0b18b57ae46d11eda47b2fb75e914c1055ad6961eafae5e7441cdb0642e31578ffd8c10e988d570b23088db0aa5ddf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
