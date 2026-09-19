SUMMARY = "Victor Eijkhout's packages"
DESCRIPTION = "Three unrelated packages: DB_process, to parse and process \
database output; CD_labeler, to typeset user text to fit on a \
CD label; and repeat, a nestable, generic loop macro."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-eijkhout-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "70a90786fdf854fdcbaabc219b31610da7bae5034cb0ece87b920bb0794dbd52feb97da1920c2d59d83f4a1f8d87f760215773ae238ddc6e1ac19c5bd1803176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CD-labeler-test.tex \
tex-CD-labeler.tex \
tex-DB-process.tex \
tex-repeat.tex \
texlive-eijkhout"

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
