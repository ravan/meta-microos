SUMMARY = "Documentation for texlive-jeuxcartes"
DESCRIPTION = "This package includes the documentation for texlive-jeuxcartes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn76966"

RPM_NAME = "texlive-jeuxcartes-doc-2026.226.0.0.3.5svn76966-63.2.noarch.rpm"
RPM_HASH = "151954517f92e432cce7f0a0e55d5c89683791cd5c72bde3bc46cbd3752b957da1ec4c86e3dee1763084152e702c457eb12c59515b4f2e00be84af287561ccf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jeuxcartes-doc-fr \
texlive-jeuxcartes-doc"

RDEPENDS:${PN} += ""

inherit rpm
