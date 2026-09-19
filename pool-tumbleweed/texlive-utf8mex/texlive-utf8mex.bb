SUMMARY = "Tools to produce formats that read Polish language input"
DESCRIPTION = "The bundle provides files for building formats to read input in \
Polish encodings."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-utf8mex-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "886eb6f874a94cbacd5cb00476e9e3405c8710e376c43bd510e3adce06dfbaaeb61f8fa6febaf0d270f5b475dbf4c41d45bb05500d24dd67c2c3c5dc4319ee17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utf8-pl.tex \
tex-utf8plsq.tex \
texlive-utf8mex"

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
