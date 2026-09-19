SUMMARY = "Draw dashed rules"
DESCRIPTION = "This package provides a flexible solution for drawing dashed \
rules in the body. It currently provides two commands, \
\\hdashrule and \\hanyrule. It is written in LaTeX3 and can be \
used as an alternative to the dashrule package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02dsvn76924"

RPM_NAME = "texlive-dashrulex-2026.226.1.02dsvn76924-61.2.noarch.rpm"
RPM_HASH = "24266f348faf432554d97a4ca6bc235ec78ef42a6509d6040cdeefa262d1f9f591c6ed262d65346d9457f592b0bd58625a83d71a542850dca50ee9379a908aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashrulex.sty \
texlive-dashrulex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
