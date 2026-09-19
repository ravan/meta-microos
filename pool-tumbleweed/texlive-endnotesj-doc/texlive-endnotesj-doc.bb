SUMMARY = "Documentation for texlive-endnotesj"
DESCRIPTION = "This package includes the documentation for texlive-endnotesj"
LICENSE = "BSD-3-Clause"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-endnotesj-doc-2026.226.3.0svn77682-61.4.noarch.rpm"
RPM_HASH = "c69912e38aaa4fc9be5bed39d0d9d92e91a91021e890ac9a928059f3384263dd7106027092a1d20a5cf9f4c73b8d8b1522cef1ba02184cf69c52e2afee16dfee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-endnotesj-doc-ja \
texlive-endnotesj-doc"

RDEPENDS:${PN} += ""

inherit rpm
