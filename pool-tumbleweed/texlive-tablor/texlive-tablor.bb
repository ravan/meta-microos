SUMMARY = "Create tables of signs and of variations"
DESCRIPTION = "The package allows the user to use the computer algebra system \
XCAS to generate tables of signs and of variations (the actual \
plotting of the tables uses the MetaPost macro package \
tableauVariations). Tables with forbidden regions may be \
developed using the package. A configuration file permits some \
configuration of the language to be used in the diagrams. The \
tablor package requires that shell escape be enabled."
LICENSE = "LPPL-1.0"

PV = "2026.227.4.07_gsvn31855"

RPM_NAME = "texlive-tablor-2026.227.4.07_gsvn31855-62.2.noarch.rpm"
RPM_HASH = "1b36b8d2e2167e7cacf196c1c3c253c91d46c0dba59a7b66b0970a9be56b7d4f91c7c646b19a470db9cc7b852fc7986bbb4bbe42e26995ac9f8aeae0026eec2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablor-xetex.sty \
tex-tablor.cfg \
tex-tablor.sty \
texlive-tablor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fancyvrb.sty \
tex-filecontents.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-pst-eps.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
