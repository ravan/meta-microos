SUMMARY = "Typeset captions sideways"
DESCRIPTION = "Defines environments called SCfigure and SCtable (analogous to \
figure and table) to typeset captions sideways. Options include \
outercaption, innercaption, leftcaption and rightcaption."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7asvn77682"

RPM_NAME = "texlive-sidecap-2026.226.1.7asvn77682-60.2.noarch.rpm"
RPM_HASH = "0ba20afe5c24ff708ebe636288d88f6d3085bf04876ea38a9dc44aca63364d1d83ca1b5c673a1e789e6a5f612c52d38cac829b856fcf1447c74744d7fd798ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidecap.sty \
texlive-sidecap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
