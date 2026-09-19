SUMMARY = "Running headers of the form 'Notes to pp.xx-yy'"
DESCRIPTION = "This package provides running headers of the form 'Notes to pp. \
xx-yy' for endnotes sections. It also enables one to reset the \
endnotes counter, and put a line marking the chapter change in \
the endnotes, at the beginning of every chapter. Endheads \
requires the fancyhdr, needspace, ifthen, and endnotes \
packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn73959"

RPM_NAME = "texlive-endheads-2026.226.1.7svn73959-61.4.noarch.rpm"
RPM_HASH = "fcf9e7124423424dee0741568c8b520c370d414402a5070b742a75436e7d9db5f59cbf7e6f41f261e3c92941c9845e9d0eb41a73e2a59efadcfd9e40db0fcb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endheads.sty \
texlive-endheads"

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
