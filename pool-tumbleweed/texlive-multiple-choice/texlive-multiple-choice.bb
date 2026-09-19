SUMMARY = "LaTeX package for multiple-choice questions"
DESCRIPTION = "This package adjusts the choices of the multiple-choice \
question automatically. It has been wholly inspired by the work \
of Enrico Gregorio and improved by Vafa Khalighi and I've just \
packed and redistributed it under the name of the \
multiple-choice package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn63722"

RPM_NAME = "texlive-multiple-choice-2026.226.0.0.2svn63722-61.2.noarch.rpm"
RPM_HASH = "ee75e3bdaca8a71cbfe797c3dbf1fdf0eb84f39acb8d18647de8f23e54459c17e9a252aca25a2424812f5b6c0a4ceed290f844873b7f44d938160fd8d841cf8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiple-choice.sty \
texlive-multiple-choice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
