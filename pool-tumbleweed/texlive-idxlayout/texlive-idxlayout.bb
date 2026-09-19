SUMMARY = "Configurable index layout, responsive to KOMA-Script and memoir"
DESCRIPTION = "The idxlayout package offers a key-value interface to configure \
index layout parameters, e.g. allowing for three-column indexes \
or for 'parent' items and their affiliated subitems being \
typeset as a single paragraph. The package is responsive to the \
index-related options and commands of the KOMA-Script and \
memoir classes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-2026.226.0.0.4dsvn25821-60.2.noarch.rpm"
RPM_HASH = "b648800c5af988eefe3eaa135a3f94daf4e70b0948cea2c30ad72752cae7176835ba5033e06a1a39c7d09bc4022c625137b94ddf15a45cca2605bce78af3d229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxlayout.sty \
texlive-idxlayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-multicol.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
