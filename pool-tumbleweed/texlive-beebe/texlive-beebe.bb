SUMMARY = "A collection of bibliographies"
DESCRIPTION = "A collection of BibTeX bibliographies on TeX-related topics \
(including, for example, spell-checking and SGML). Each \
includes a LaTeX wrapper file to typeset the bibliography."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77590"

RPM_NAME = "texlive-beebe-2026.226.svn77590-61.2.noarch.rpm"
RPM_HASH = "5b2f8cb46b3fcef690d25356e399350de895d3cafd5f4b37e1226adf9c2f109faee13e1101e963131ba8d497561a5af7e2de6944ecc107dbfbc669e5a96be4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibnames.sty \
tex-texnames.sty \
tex-tugboat.def \
texlive-beebe"

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
