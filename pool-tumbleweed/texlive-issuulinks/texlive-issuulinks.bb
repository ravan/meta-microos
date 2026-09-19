SUMMARY = "Produce external links instead of internal ones"
DESCRIPTION = "The PDF visualizer http://issuu.com/ISSUU is a popular service \
which shows PDF documents 'a page a time'. Due to the way it is \
implemented, internal links in these documents are not allowed. \
Instead, they must be converted to external ones in the form \
http://issuu.com/action/page?page=PAGENUMBER. The package \
patches hyperref to produce external links in the required form \
instead of internal links created by \\ref, \\cite and other \
commands. Since the package redefines the internals of \
hyperref, it must be loaded it AFTER hyperref."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn25742"

RPM_NAME = "texlive-issuulinks-2026.226.1.1svn25742-63.2.noarch.rpm"
RPM_HASH = "fd3467573074dc2535308f2576a292849baf758ec3c0277fd6392e48cf116f44cf7b3649e903d7b8dd9b4fc86e5c4ddfd95d21ff8a456375fb7447a7d72e118b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-issuulinks.sty \
texlive-issuulinks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
