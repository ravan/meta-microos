SUMMARY = "A font that provides the product integral symbol"
DESCRIPTION = "Product integrals are to products, as integrals are to sums. \
They have been around for more than a hundred years, they have \
not become part of the standard mathematician's toolbox, \
possibly because no-one invented the right mathematical symbol \
for them. The authors have remedied that situation by proposing \
the symbol and providing this font."
LICENSE = "OFL-1.1"

PV = "2026.226.svn21893"

RPM_NAME = "texlive-prodint-2026.226.svn21893-59.2.noarch.rpm"
RPM_HASH = "42d2a7fa8968969512e6f422311a31a0dafe76fa3aec1851b2072fe746273bba849a65d66356f7dac58ba3f9c93e9cf10cfb04c82e3a6876c0dcf0d94cac58bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prodint.map \
tex-prodint.sty \
tex-prodint.tfm \
texlive-prodint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-prodint-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
