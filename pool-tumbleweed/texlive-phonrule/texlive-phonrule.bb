SUMMARY = "Typeset linear phonological rules"
DESCRIPTION = "The package provides macros for typesetting phonological rules \
like those in 'Sound Pattern of English' (Chomsky and Halle \
1968)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn43963"

RPM_NAME = "texlive-phonrule-2026.226.1.3.2svn43963-58.2.noarch.rpm"
RPM_HASH = "3aaa30e0141d77e1d7c25be325663fb797012c6dcb7ab5f79735c2375c031d79c29c7ee432efc496d52faf5a1501968ca3461d0ddee4d66d99d194550c186a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phonrule.sty \
texlive-phonrule"

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
