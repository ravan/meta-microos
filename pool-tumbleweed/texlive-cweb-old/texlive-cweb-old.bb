SUMMARY = "Package cweb-old"
DESCRIPTION = "The cweb-old package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49271"

RPM_NAME = "texlive-cweb-old-2026.226.svn49271-61.2.noarch.rpm"
RPM_HASH = "8fd1119686233e90bfeee99474505c7693fb8fa341d59a519b997d49073e42a05a7bbec5a8bab15099e0504a37a70ebc9aecd9c7e8ead435590c3b90b4bec4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfXcwebmac.tex \
tex-pdfcwebmac.tex \
tex-pdfdcwebmac.tex \
tex-pdffcwebmac.tex \
tex-pdficwebmac.tex \
tex-pdfwebmac.tex \
texlive-cweb-old"

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
