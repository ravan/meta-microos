SUMMARY = "LaTeX class for articles submitted to the CSTUG Bulletin (Zpravodaj)"
DESCRIPTION = "The package provides the class for articles for the CSTUG \
Bulletin (Zpravodaj Ceskoslovenskeho sdruzeni uzivatelu TeXu). \
You can see the structure of a document by looking at the \
source file of the manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77112"

RPM_NAME = "texlive-csbulletin-2026.226.svn77112-61.2.noarch.rpm"
RPM_HASH = "a0df78491c0ac04dc2830209e062caeeff4fe6326c80172de57b8a81b0a63c79f0e4d03c78202d76c6286333e771edbe71607ab0bbf36b7d4ded18162ab3cd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csbulacronym.sty \
tex-csbulletin.cls \
tex-csbulobalka.cls \
tex-csbulobalka.sty \
tex-csbulv1.cls \
texlive-csbulletin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-color.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-lmodern.sty \
tex-mflogo.sty \
tex-verbatim.sty \
tex-zwpagelayout.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
