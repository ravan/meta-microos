SUMMARY = "LaTeX pictures 'how-to' (German)"
DESCRIPTION = "The document (in German) is a collection of 'how-to' notes \
about LaTeX and pictures. The aim of the document is to provide \
a solution, in the form of some sample code, for every problem."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.1.50svn19601"

RPM_NAME = "texlive-l2picfaq-2026.226.1.50svn19601-63.2.noarch.rpm"
RPM_HASH = "6404bdcc62b54a079f84746387b03890c3284d214e10c29e07e3e970ceb9c4958fd0c38803949f67f6641c133c486b04901d7ad77bf55cd6136108bec7d7577a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2picfaq"

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
