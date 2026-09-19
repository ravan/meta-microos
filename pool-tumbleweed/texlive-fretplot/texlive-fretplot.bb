SUMMARY = "Create scale and chord diagrams for guitar-like instruments"
DESCRIPTION = "This LuaLaTeX package provides batch generation of scale and \
chord diagrams for plucked string instruments, such as the \
guitar. Flexible and Automated: Highly customizable and \
automatable via simple, powerful file formats for describing \
fretboard diagrams. Easily generate batches of diagrams. \
Attractive Defaults: Comes with sensible, visually appealing \
default settings. Music Theory Aware: Includes easy-to-use \
LaTeX macros that understand music theory. Render guitar scale \
diagrams by specifying the musical scale or scale type via \
built-in macros or directly via degree, pitch class, or \
interval formulae."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3svn76337"

RPM_NAME = "texlive-fretplot-2026.226.0.0.0.3svn76337-60.2.noarch.rpm"
RPM_HASH = "255787b5f1a54f5551f7e63227576935b24a4f660e845515c25ceacaeb4bdc7b90533d9bf1ea53e675c25108d8600b5371f800574b32b1e47b954f2f735eac15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fretplot.sty \
texlive-fretplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
