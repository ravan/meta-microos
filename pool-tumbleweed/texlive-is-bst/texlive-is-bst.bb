SUMMARY = "Extended versions of standard BibTeX styles"
DESCRIPTION = "The bundle contains an extended version (xbtxbst.doc) of the \
source of the standard BibTeX styles, together with \
corresponding versions of the standard styles. The styles offer \
support for CODEN, ISBN, ISSN, LCCN, and PRICE fields, extended \
PAGES fields, the PERIODICAL entry, and extended citation label \
suffixing."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.03svn76790"

RPM_NAME = "texlive-is-bst-2026.226.2.03svn76790-63.2.noarch.rpm"
RPM_HASH = "7a94002c8768dd7dbbdc7b1428b7bbf3384ff4a912bd6577f77a10d12897e85c1a3598036e390dce1a8222ccfc356d11fed9b6b9a19bfdaa74eb7d5981e1bdfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-is-bst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
