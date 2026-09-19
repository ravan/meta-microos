SUMMARY = "Extension for the gb4e package"
DESCRIPTION = "This is an add-on for the gb4e package used in linguistics. It \
implements the \\Next, \\NNext, \\Last, and \\LLast commands from \
the linguex package or the \\nextx, \\anextx, \\lastx, \\blastx, \
and \\bblastx commands from the expex package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0svn56575"

RPM_NAME = "texlive-nnext-2026.226.0.0.0svn56575-61.2.noarch.rpm"
RPM_HASH = "82435500c3985d6703169afa7dce242aa29aa8c4eb73c01064db01803682fe82cb59841115c40a81b5c08f95408cf40fa8b5753d80bda5ad8f63ceb91e7aa97b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nnext.sty \
texlive-nnext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
