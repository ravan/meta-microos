SUMMARY = "Documentation for texlive-unitsdef"
DESCRIPTION = "This package includes the documentation for texlive-unitsdef"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-unitsdef-doc-2026.226.0.0.2svn15878-60.2.noarch.rpm"
RPM_HASH = "73f9dffbef19b7ce661289416a9c88b9c72ad29d1b7ce516d2d553b2dd9f25b07405145d000afc9b7c93704a046e64716275098fa7bbe0b5c0bec4cb100e7c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitsdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
