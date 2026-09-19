SUMMARY = "A class for Brandeis University M.A. theses"
DESCRIPTION = "brandeis-thesis.cls provides the structures and formatting \
information for an M.A. thesis for the Brandeis University \
Graduate School of Arts and Sciences."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn68092"

RPM_NAME = "texlive-brandeis-thesis-2026.226.3.3svn68092-59.2.noarch.rpm"
RPM_HASH = "ad1907c717eda0703506b14d8457147e0f93e73e8e4a149191000acc6442930db9da08b67c3d6f58553c8e6fbfc6eb490af28fa9251db21b08d9d7b79ac965bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-thesis.cls \
texlive-brandeis-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-book.cls \
tex-csquotes.sty \
tex-geometry.sty \
tex-inputenc.sty \
tex-mathptmx.sty \
tex-sectsty.sty \
tex-setspace.sty \
tex-silence.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
