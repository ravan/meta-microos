SUMMARY = "Knuth's 'manual' fonts"
DESCRIPTION = "Metafont (by Donald Knuth) and Adobe Type 1 (by Taco Hoekwater) \
versions of the font containing the odd symbols Knuth uses in \
his books. LaTeX support is available using the manfnt package"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn45777"

RPM_NAME = "texlive-manfnt-font-2026.226.svn45777-59.2.noarch.rpm"
RPM_HASH = "6feb61273ecc5e55a0dd16d6112e39e3b0c1f74c172f909eac5cc673728db67280def1e78cdfec8594c22a94eadc9b42f9bb4f3f8357f4c1d9a0c6bf72c421b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manfnt.map \
texlive-manfnt-font"

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
texlive-manfnt-font-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
