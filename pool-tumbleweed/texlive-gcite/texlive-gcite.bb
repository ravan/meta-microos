SUMMARY = "Citations in a reader-friendly style"
DESCRIPTION = "The package allows citations in the German style, which is \
considered by many to be particularly reader-friendly. The \
citation provides a small amount of bibliographic information \
in a footnote on the page where each citation is made. It \
combines a desire to eliminate unnecessary page-turning with \
the look-up efficiency afforded by numeric citations. The \
package makes use of BibLaTeX, and is considered experimental; \
comment is invited."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn15878"

RPM_NAME = "texlive-gcite-2026.226.1.0.1svn15878-60.2.noarch.rpm"
RPM_HASH = "8e6aca111fc6ee5de982bc07d53edf466d017f5c461e10fd91a4a5e4e575ae65f00541ffc11ee3f85455836c5b669400b2338f82d3dd6d90321b5935f7a182bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gcite.sty \
texlive-gcite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
