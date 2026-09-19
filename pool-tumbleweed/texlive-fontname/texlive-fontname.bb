SUMMARY = "Scheme for naming fonts in TeX"
DESCRIPTION = "The scheme for assigning names is described (in the \
documentation part of the package), and map files giving the \
relation between foundry name and 'TeX-name' are also provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75544"

RPM_NAME = "texlive-fontname-2026.226.svn75544-60.2.noarch.rpm"
RPM_HASH = "b465e73e8ce74a5b860580f63150a0071d2e7af18c3cf3a6509d2895a58fce6448257a43f03edc9d7cdf049189a1ecf95d0f8fd250f59f6bf621cd7d37decdc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-special.map \
tex-supplier.map \
tex-texfonts.map \
tex-typeface.map \
tex-urw.map \
tex-variant.map \
tex-weight.map \
tex-width.map \
texlive-fontname"

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
