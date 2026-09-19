SUMMARY = "LaTeX Reference Sheet for a thesis with KOMA-Script"
DESCRIPTION = "This LaTeX Reference Sheet is for writing a thesis using the \
KOMA-Script document classes (scrartcl, scrreprt, scrbook) and \
all the packages needed for a thesis in natural sciences."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn45076"

RPM_NAME = "texlive-latex-refsheet-2026.226.1.2svn45076-63.2.noarch.rpm"
RPM_HASH = "8dd57ee6d8bf61b3f53201861ed138952a527171ad2afa625017915a9a64093269c90b1c7e3147c5b1b03aab958b55d345135665066305fbac0e2c318c21db51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-refsheet"

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
