SUMMARY = "Examples from 'The LaTeX Companion', second edition"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files. The book was published by \
Addison-Wesley, 2004, ISBN 0-201-36299-6."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn26096"

RPM_NAME = "texlive-tlc2-2026.226.svn26096-59.2.noarch.rpm"
RPM_HASH = "2062d623bfbb38538293bb56c699a66b87a5f033c159a65fc7c3417692d4447d35a29bccda5f7293bb827784e85d3ce689f97ffc28bf88063c1ea46b62d7636f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc2"

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
