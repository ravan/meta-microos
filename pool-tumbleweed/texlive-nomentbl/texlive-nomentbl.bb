SUMMARY = "Nomenclature typeset in a longtable"
DESCRIPTION = "Nomentbl typeset nomenclatures in a longtable instead of the \
makeindex style of nomencl. A nomenclature entry may have three \
arguments: Symbol, description and physical unit."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn16549"

RPM_NAME = "texlive-nomentbl-2026.226.0.0.4svn16549-61.2.noarch.rpm"
RPM_HASH = "5ed59feed313032d4a4bce03ed974cf7673f1205dff43c90a02f52e24e6d4b2833050f4a0f33c7451e70cf2d72afe7e919a89f944af25ae0a1202f2cc2ac8fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nomentbl.sty \
texlive-nomentbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-nomencl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
