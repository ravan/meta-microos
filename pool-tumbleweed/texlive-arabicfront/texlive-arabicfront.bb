SUMMARY = "Frontmatter with arabic page numbers"
DESCRIPTION = "This package modifies the definitions of \\frontmatter and \
\\mainmatter so that page numbering starts in arabic style from \
the front matter while preserving the rest of the original \
definitions. For it to work, \\pagenumbering has to be inside \
these macros--most of classes do that, but there are exceptions \
like memoir."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-arabicfront-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "ed4f2980c2b7c67a2f037068fad72bf33159b754f000c21dbdf21053d75f94e2b17e81e58ebd182ef447424bbaae31c7ae3ad1ceeb82a35f4ef37cd93701987b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabicfront.sty \
texlive-arabicfront"

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
