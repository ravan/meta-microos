SUMMARY = "Documentation for texlive-gmp"
DESCRIPTION = "This package includes the documentation for texlive-gmp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gmp-doc-2026.226.1.0svn77682-60.4.noarch.rpm"
RPM_HASH = "379bfb59d1e9ec29b06351a29622c18caea2620b73656f84dc678b16a788724f0264fb810b5326eb6aae61761ab2cf5ec5faa932f4ea1790978bf4cbb37b9e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
