SUMMARY = "Customisation of cross-references in LaTeX"
DESCRIPTION = "The package contains macros which allow authors to easily \
customise how cross-references appear in their document, both \
in general (across all cross-references) and for particular \
types of references (identified by a prefix in the reference \
label), in a very generic manner."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-modref-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "d5421433aa5dd0e4b534ee7364d86f99c84f08f22b9a2276debc52658505403f15ab9bea3c5b654107613ec23b12d35cb6bc4fd9c08e0a452f3ce37c3a97c317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modref.sty \
texlive-modref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
