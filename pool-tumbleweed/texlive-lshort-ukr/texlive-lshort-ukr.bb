SUMMARY = "Ukrainian version of the LaTeX introduction"
DESCRIPTION = "Ukrainian version of A Short Introduction to LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.00svn55643"

RPM_NAME = "texlive-lshort-ukr-2026.226.4.00svn55643-59.2.noarch.rpm"
RPM_HASH = "6e7f48f28e0fcf1a7fc12a6fa0210169dd802ae6e0a7362df1a5fbe318629c88e7dac0595b000127ef59b415f1d641018b7b8a7f29ebadcab4ae0892401e5cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-ukr"

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
