SUMMARY = "A new bookmark (outline) organization for hyperref"
DESCRIPTION = "This package implements a new bookmark (outline) organization \
for package hyperref. Bookmark properties such as style and \
color can now be set. Other action types are available (URI, \
GoToR, Named). The bookmarks are generated in the first compile \
run. Package hyperref uses two runs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn77682"

RPM_NAME = "texlive-bookmark-2026.226.1.31svn77682-59.2.noarch.rpm"
RPM_HASH = "2b4e6a6d05098234e1180ce35fca9f7c953744e06aaee903503b1ea99cebceb5b2d17a7575370789e4527efbe1bb86a87710fbfd7775c0e9694c291b1de136ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bkm-dvipdfm.def \
tex-bkm-dvips.def \
tex-bkm-pdftex.def \
tex-bkm-vtex.def \
tex-bookmark.sty \
texlive-bookmark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
