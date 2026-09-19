SUMMARY = "A system for specifying fonts"
DESCRIPTION = "The program takes a programmatic specification of a font, and \
produces a bitmap font (whose properties are defined by a set \
of parameters of the target device), and metrics for use by \
TeX. The bitmap output may be converted into a format directly \
usable by a device driver, etc., by the tools provided in the \
parallel mfware distribution. Third parties have developed \
tools to convert the bitmap output to outline fonts. The \
distribution includes the source of Knuth's Metafont book; this \
source is there to read, as an example of writing TeX -- it \
should not be processed without Knuth's direct permission. The \
mailing list tex-fonts@math.utah.edu is the best for general \
discussion of Metafont usage; the tex-k@tug.org list is best \
for bug reports about building the software, etc."
LICENSE = "SUSE-TeX"

PV = "2026.226.2.71828182svn77830"

RPM_NAME = "texlive-metafont-2026.226.2.71828182svn77830-61.2.noarch.rpm"
RPM_HASH = "7ab73ea41302e2931588c72f03e770eb32f840da837a5d379bc17bc16d0f0fcf6f6ac608f8181e320bbb563abb7ac0bbcb8763b56c650d0ee44fe588776a0bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metafont-bin \
texlive-modes \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
