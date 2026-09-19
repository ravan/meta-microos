SUMMARY = "Documentation for texlive-matapli"
DESCRIPTION = "This package includes the documentation for texlive-matapli"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn76924"

RPM_NAME = "texlive-matapli-doc-2026.226.1.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "56f517b960fa00503c16f9e4e07ce6599ec93e171f47d4ee4a5d8269e65c60fc830eae9b72c2a1d736dc92920d28fe54d38dd6ecf95e1e6930562d328dae84e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-matapli-doc-fr \
texlive-matapli-doc"

RDEPENDS:${PN} += ""

inherit rpm
