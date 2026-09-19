SUMMARY = "Documentation for texlive-chemschemex"
DESCRIPTION = "This package includes the documentation for texlive-chemschemex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn46723"

RPM_NAME = "texlive-chemschemex-doc-2026.226.1.2svn46723-60.2.noarch.rpm"
RPM_HASH = "760c344a46982150fe15092c8b019c9d993bc9faaef1b8add73ac5ef03ad096b7ba40912ca38411361dc5ffc37aa9643a4287ede6410eacb2acae6cdcb6bc2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemschemex-doc"

RDEPENDS:${PN} += ""

inherit rpm
