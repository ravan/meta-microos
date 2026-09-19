SUMMARY = "Font encodings, metrics and Lua script fragments for font creation"
DESCRIPTION = "Font encodings, metrics and Lua script fragments for generating \
font support packages for 8-bit engines with l3build. Optional \
template-based system enables the automatic generation of font \
tables and l3build tests. Easy addition of variable scaling to \
fd files (unsupported by some tools). Primarily designed for \
fontinst, but can be adapted for use with other programmes. \
Default configuration is intended to be cross-platform and \
require only tools included in TeX Live, but the documentation \
includes a simple adaption for integration with FontForge and \
GNU make."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn74247"

RPM_NAME = "texlive-fontscripts-2026.226.0.0.3svn74247-60.2.noarch.rpm"
RPM_HASH = "dc68b472ec34961cf7333bdb4b593057d1d9e83660e2cdd14d73b24e65f124fe587d923593edcf694aaffae392a60832202a4b28f74c1605692e034af0576c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fntbuild-regression-test.tex \
tex-fntbuild-tables.tex \
texlive-fontscripts"

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
