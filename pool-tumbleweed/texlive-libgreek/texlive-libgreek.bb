SUMMARY = "Greek letters in math mode from Libertinus or Linux Libertine/Biolinum"
DESCRIPTION = "This package allows LaTeX users (especially if using \
traditional LaTeX/pdfLaTeX) to set the Greek letters in math \
mode using the glyphs from the Libertinus Serif or Sans font \
via the font support files provided by Bob Tennent's \
libertinus-type1 package. All Greek letters are defined both in \
\\...up and \\...it variants. The style (ISO, TeX, or French i.e. \
upright) can be modified midway in the document. A 'legacy' \
mode uses font support from the (obsolete) libertine-legacy \
package which maps to the Linux Libertine or Biolinum fonts. \
This package is for users who only want to customize Greek \
letters in math mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75712"

RPM_NAME = "texlive-libgreek-2026.226.1.1svn75712-61.2.noarch.rpm"
RPM_HASH = "5cf58f338cd75f66cd4fc595ce8f2271c85f70e70921f1a0aebc98dcd3bf74d17c94f53732ff5ca75e8d2380a5e87bcab85292948631c7018debd2119a375960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libgreek-legacy.sty \
tex-libgreek.sty \
texlive-libgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
