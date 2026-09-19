SUMMARY = "Local allocation macros for LaTeX 2015"
DESCRIPTION = "Local allocation macros, with names taken from etex.sty but \
with implementation based on the LaTeX 2015 allocation macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-2026.226.0.0.03svn42712-61.4.noarch.rpm"
RPM_HASH = "c5da97d833435de87fad957a9f51208565bc849bc6334056c5c090064dc65902cfb6da43f81a4c762243b996bb13ea70740e7e01d9adcc4b13af74a27986c393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elocalloc.sty \
texlive-elocalloc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
