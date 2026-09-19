SUMMARY = "Documentation for texlive-interactiveworkbook"
DESCRIPTION = "This package includes the documentation for texlive-interactiveworkbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-interactiveworkbook-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "9b350b51ffce6cb33beb3f6505f440fe520b712309a6b3b681e312742227da921595d0102cb07b2c5dec45b89f64bb71d1faf4b1d4a507cec26abe0864ddf71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interactiveworkbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
