SUMMARY = "Documentation for texlive-lplfitch"
DESCRIPTION = "This package includes the documentation for texlive-lplfitch"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn75712"

RPM_NAME = "texlive-lplfitch-doc-2026.226.0.0.9svn75712-61.2.noarch.rpm"
RPM_HASH = "02d355044d0e42d635094a0b4a22a8a1bc57af78e8aa7db483d8100307d97815f4859324da20399e5a6f2b44ecc9215c3b86b3eb1aa80deb249c92f65bd1eb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lplfitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
