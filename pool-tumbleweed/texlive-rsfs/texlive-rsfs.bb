SUMMARY = "Ralph Smith's Formal Script font"
DESCRIPTION = "The fonts provide uppercase 'formal' script letters for use as \
symbols in scientific and mathematical typesetting (in contrast \
to the informal script fonts such as that used for the \
'calligraphic' symbols in the TeX maths symbol font). The fonts \
are provided as Metafont source, and as derived Adobe Type 1 \
format. LaTeX support, for using these fonts in mathematics, is \
available via one of the packages calrsfs and mathrsfs."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-rsfs-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "46fe598fc4087394f954f27c27967732e20e7a92308dba880c6de2f9d56ece205b2aba60fa43bca381ba1c4421c54c3c043eca491d40240d9159245d44d01918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rsfs.map \
tex-rsfs10.tfm \
tex-rsfs5.tfm \
tex-rsfs7.tfm \
tex-scrload.tex \
texlive-rsfs"

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
texlive-rsfs-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
