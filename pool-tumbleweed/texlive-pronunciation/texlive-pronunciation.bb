SUMMARY = "American English Pronunciation"
DESCRIPTION = "This style file is designed for automatically typing phonetic \
symbols in American English. The system supports as many as \
21,082 English words all told. The main packages used in \
pronunciation.sty are ifthen, xparse and tipa."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn73701"

RPM_NAME = "texlive-pronunciation-2026.226.1.0.2svn73701-59.2.noarch.rpm"
RPM_HASH = "208fd2b473e74b49fa5aef6e4df4e40ada62b753f7d044de7d3670fd0bf2e0d68fb7b74bef5cbdbd2958a7ac946498e3ae0ccefa2489d250d9db0a84b3fe9c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pronunciation.sty \
texlive-pronunciation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tipa.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
