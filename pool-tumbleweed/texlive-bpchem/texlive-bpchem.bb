SUMMARY = "Typeset chemical names, formulae, etcetera"
DESCRIPTION = "The package provides support for typesetting simple chemical \
formulae, those long IUPAC compound names, and some chemical \
idioms. It also supports the labelling of compounds and \
reference to labelled compounds."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75878"

RPM_NAME = "texlive-bpchem-2026.226.1.1svn75878-59.2.noarch.rpm"
RPM_HASH = "a1e6de5e88218c74ae010eedfc7f377209aa11cd7c98611fd4b50de3f63ac688d61f1f8e67591beaac9267a3f82fb2ca31d053c84aca58cc2fde1391d7bfb723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bpchem.sty \
texlive-bpchem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lgrenc.def \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
