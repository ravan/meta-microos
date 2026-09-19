SUMMARY = "Concrete Roman fonts"
DESCRIPTION = "Concrete Roman fonts, designed by Donald E. Knuth, originally \
for use with Euler mathematics fonts. Alternative mathematics \
fonts, based on the concrete 'parameter set' are available as \
the concmath fonts bundle. LaTeX support is offered by the \
beton, concmath and ccfonts packages. T1- and TS1-encoded \
versions of the fonts are available in the ecc bundle, and \
Adobe Type 1 versions of the ecc fonts are part of the cm-super \
bundle."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-concrete-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "9a0c2f58d2f439432b3128e8a1cb7ef80c90353b8000c0cd9e0597e5920b7dcbbf5898163df132eeab972b86fd7a85aa118b8e81f2247d756ad957c8d9bc3b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cccsc10.tfm \
tex-ccmi10.tfm \
tex-ccmic9.tfm \
tex-ccr10.tfm \
tex-ccr5.tfm \
tex-ccr6.tfm \
tex-ccr7.tfm \
tex-ccr8.tfm \
tex-ccr9.tfm \
tex-ccsl10.tfm \
tex-ccsl9.tfm \
tex-ccslc9.tfm \
tex-ccti10.tfm \
texlive-concrete"

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
