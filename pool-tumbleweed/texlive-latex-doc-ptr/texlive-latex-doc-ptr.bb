SUMMARY = "A direction-finder for LaTeX resources available online"
DESCRIPTION = "A brief set of recommendations for users who need online \
documentation of LaTeX. The document supports the need for \
documentation of LaTeX itself, in distributions. For example, \
it could be used in the command texdoc latex, in the TeX Live \
distribution."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77050"

RPM_NAME = "texlive-latex-doc-ptr-2026.226.svn77050-63.2.noarch.rpm"
RPM_HASH = "d1230f166abe6afb2365ab0b49d6af5ae4a1341df8c845de67ffab833ec1ac372f8c6375c1515d704d9f1ac85210bf94b6ce51d88fe35249d1d7eca9ddcc3b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-doc-ptr"

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
