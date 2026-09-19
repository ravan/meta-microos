SUMMARY = "Turn warnings into errors"
DESCRIPTION = "This LaTeX package helps you make the build more fragile by \
turning warnings into errors. This may be a good practice if \
you care about the quality of your documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.2svn67543"

RPM_NAME = "texlive-fail-fast-2026.226.0.0.0.2svn67543-59.2.noarch.rpm"
RPM_HASH = "13cca6ac9d28735c05847965d9868932bd80461e958e4de09d77de863966ac46a4b54e871b303d0028666fc44a248f366e305c968e0f1cc9438d55ea08c4b7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fail-fast.sty \
texlive-fail-fast"

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
