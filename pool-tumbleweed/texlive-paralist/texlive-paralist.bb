SUMMARY = "Enumerate and itemize within paragraphs"
DESCRIPTION = "Provides enumerate and itemize environments that can be used \
within paragraphs to format the items either as running text or \
as separate paragraphs with a preceding number or symbol. Also \
provides compacted versions of enumerate and itemize."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-paralist-2026.226.2.7svn77682-58.2.noarch.rpm"
RPM_HASH = "ae18e617b7aa5165c0b18ca8baaea9ad236800daa78be9ef8f6df52fd55509506e6672b18e6db773684a697af136a31a4304dfc6931e4219e5bc47838e11d905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paralist.sty \
texlive-paralist"

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
