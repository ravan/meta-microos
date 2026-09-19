SUMMARY = "Control layout of itemize, enumerate, description"
DESCRIPTION = "This package provides user control over the layout of the three \
basic list environments: enumerate, itemize and description. It \
supersedes both enumerate and mdwlist (providing \
well-structured replacements for all their functionality), and \
in addition provides functions to compute the layout of labels, \
and to 'clone' the standard environments, to create new \
environments with counters of their own."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.11svn77682"

RPM_NAME = "texlive-enumitem-2026.226.3.11svn77682-61.4.noarch.rpm"
RPM_HASH = "2d929e1d263a762d407168f6b75b5aab7a85f5c6b851bb2f263925834fe2062822797d1ac30d884a4c429a9d874b971a675dadbab6ddd4c2c56c529e315e14a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enumitem.sty \
texlive-enumitem"

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
