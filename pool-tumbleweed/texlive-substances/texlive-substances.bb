SUMMARY = "A database of chemicals"
DESCRIPTION = "The package provides the means to create a database-like file \
that contains data of various chemicals. These data may be \
retrieved in the document; an index of the chemicals mentioned \
in the document can be created.."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2asvn76924"

RPM_NAME = "texlive-substances-2026.226.0.0.2asvn76924-64.2.noarch.rpm"
RPM_HASH = "e0e394a81f399241324385a159e2105b0a3e6538b6c8abf693099e9208fc6e1e8491e51e44d909fa80c00a1309a8703ba84922f0dafa400444eae8bd363728ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-substances-default.def \
tex-substances.sty \
texlive-substances"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemfig.sty \
tex-chemmacros.sty \
tex-expl3.sty \
tex-ghsystem.sty \
tex-l3keys2e.sty \
tex-siunitx.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
