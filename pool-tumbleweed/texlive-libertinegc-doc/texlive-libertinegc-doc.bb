SUMMARY = "Documentation for texlive-libertinegc"
DESCRIPTION = "This package includes the documentation for texlive-libertinegc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn44616"

RPM_NAME = "texlive-libertinegc-doc-2026.226.1.01svn44616-61.2.noarch.rpm"
RPM_HASH = "66808487cd664a01569d9c1d2f947a72c326365a68efaeb1c19d0f0204a699c723f63a317b31e5d99801694c479275995c701134712ffa195cb5e53abca345ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinegc-doc"

RDEPENDS:${PN} += ""

inherit rpm
