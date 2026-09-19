SUMMARY = "Templates for TeX usage"
DESCRIPTION = "A set of templates for using LaTeX packages that the author \
uses, comprising: - Hausarbeit.tex: for students of the \
Lehrstuhl Volkskunde an der Friedrich-Schiller-Universitat \
Jena; - Psycho-Dipl.tex: for diploma theses in psychology."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-templates-sommer-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "5174911077c960a1606af2c8212add66a78d45d542506593c872c5fae57de927a4d069128cd28a057e6a7c9156ce350509ca01531f755d137a9255447c7bb16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templates-sommer"

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
