SUMMARY = "Texinfo documentation system"
DESCRIPTION = "Texinfo is the preferred format for documentation in the GNU \
project; the format may be used to produce online or printed \
output from a single source. The Texinfo macros may be used to \
produce printable output using TeX; other programs in the \
distribution offer online interactive use (with hypertext \
linkages in some cases). The latest release of the texinfo.tex \
macros and texi2dvi and texi2pdf scripts may be found in the \
texinfo-latest package, which are usually newer than the last \
full release. CTAN does not hold any other Texinfo-related \
files; see its GNU home page for downloads and other info."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.svn77327"

RPM_NAME = "texlive-texinfo-2026.227.svn77327-62.2.noarch.rpm"
RPM_HASH = "2efacf00f337a8577b3730bf91f173ac9186e8bb0f5d1ec50df892b03baac015d13da2981c5851a3c6ec1462a17db4f4d9bfa0e1a52a603273c683706178620f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texinfo-ja.tex \
tex-texinfo-zh.tex \
tex-texinfo.tex \
tex-txi-ca.tex \
tex-txi-cs.tex \
tex-txi-de.tex \
tex-txi-en.tex \
tex-txi-es.tex \
tex-txi-fi.tex \
tex-txi-fr.tex \
tex-txi-hu.tex \
tex-txi-is.tex \
tex-txi-it.tex \
tex-txi-ja.tex \
tex-txi-nb.tex \
tex-txi-nl.tex \
tex-txi-nn.tex \
tex-txi-pl.tex \
tex-txi-pt.tex \
tex-txi-ru.tex \
tex-txi-sr.tex \
tex-txi-tr.tex \
tex-txi-uk.tex \
tex-txi-zh.tex \
texlive-texinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-amsfonts \
texlive-cm-super \
texlive-ec \
texlive-epsf \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
