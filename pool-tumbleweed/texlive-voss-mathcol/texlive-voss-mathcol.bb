SUMMARY = "Typesetting mathematics in colour, in (La)TeX"
DESCRIPTION = "This is a short paper from the TeXnische Komodie, in German. \
Since the body of the paper is dominated by clear LaTeX coding \
examples, most LaTeX programmers will understand how to achieve \
the results shown in the diagrams, even if they don't \
understand German."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn32954"

RPM_NAME = "texlive-voss-mathcol-2026.226.0.0.1svn32954-60.2.noarch.rpm"
RPM_HASH = "95a9a99559a4e68843b682d569fa672999f18f46a419fe943bcfc06007d70d1f5fd32897fc4eb8a486d738b39378baa3124be6ea4ce0aaf68a4e4992058cea1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-voss-mathcol"

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
