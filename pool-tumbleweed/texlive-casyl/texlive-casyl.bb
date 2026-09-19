SUMMARY = "Typeset Cree/Inuktitut in Canadian Aboriginal Syllabics"
DESCRIPTION = "The bundle constitutes a font (as Metafont source) and LaTeX \
macros for its use within a document."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-casyl-2026.226.2.0svn15878-59.2.noarch.rpm"
RPM_HASH = "be009e8e9e6f84036fe78d9488203afd2879eb203d420e96eac037c03950a5b574a4cae586a05173d77adaf6710072060345dba9dffa8d14859c12129e15345f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-casyll10.tfm \
tex-casyltex.sty \
texlive-casyl"

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
