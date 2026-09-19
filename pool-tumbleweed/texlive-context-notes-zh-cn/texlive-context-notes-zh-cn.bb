SUMMARY = "A ConTeXt LMTX introduction for Chinese users"
DESCRIPTION = "An introductory tutorial on ConTeXt, in Chinese. The document \
covers ConTeXt installation, fonts, layout design, \
cross-reference, project structure, metafun and presentation \
design."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.svn76286"

RPM_NAME = "texlive-context-notes-zh-cn-2026.226.svn76286-61.2.noarch.rpm"
RPM_HASH = "5757f3c38212db880ef67d040f51221716b4dc7436526fe4268ff6d1d19d486240486f113179c57d0efa32cc67e5e38821f2ec7914489a3a18297ee266a443ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-notes-zh-cn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
