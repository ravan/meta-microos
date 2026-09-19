SUMMARY = "Store and compose strings"
DESCRIPTION = "This is a package to store and compose strings in a structured \
way. This can serve various purposes, for example: manage and \
write document metadata; use templates for formatting document \
data; assist in assembling and displaying document license \
information; facilitate basic internationalisation and \
localisation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.3svn74751"

RPM_NAME = "texlive-metastr-2026.226.1.1.3svn74751-61.2.noarch.rpm"
RPM_HASH = "dc2a538845556a812e9c9201a3baf8eba34312aae22bf2ab2316ddef157ea7e5162c508aacf1bdfc3a8975df73b8dadbf4000712daa8be1eee9a91f6ac8fd0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metastr.sty \
texlive-metastr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
