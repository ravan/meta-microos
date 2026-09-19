SUMMARY = "Documentation for texlive-picinpar"
DESCRIPTION = "This package includes the documentation for texlive-picinpar"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-picinpar-doc-2026.226.1.3asvn77682-58.2.noarch.rpm"
RPM_HASH = "8a295477a8bddef721c0cda715f85f759aee18a373b3e77ad75aa6acbba95fe5e79abf621c80c5744d37923ba93804553b8c06a634ed023125ff747d92d86215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-picinpar-doc-de;en \
texlive-picinpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
