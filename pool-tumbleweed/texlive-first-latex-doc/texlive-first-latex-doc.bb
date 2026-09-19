SUMMARY = "A document for absolute LaTeX beginners"
DESCRIPTION = "The document leads a reader, who knows nothing about LaTeX, \
through the production of a two page document. The user who has \
completed that first document, and wants to carry on, will find \
recommendations for tutorials."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-first-latex-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "830bbf0112a1620a29d0122313f556bf042201a03d33ec986bd29c7c509c3fcf1b40c85f9b12455450fae036c7b9a9a83003adf68bb4d3d9fe55a8cbd388b8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-first-latex-doc"

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
