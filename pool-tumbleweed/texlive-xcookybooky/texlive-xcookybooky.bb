SUMMARY = "Typeset (potentially long) recipes"
DESCRIPTION = "The package enables the user to typeset recipes, which could be \
greater than one page. Above the recipe text two (optional) \
pictures can be displayed. Other features are recipe name, \
energy content, portions, preparation and baking time, baking \
temperatures, recipe source and of course preparation steps and \
required ingredients. At the bottom you may insert an optional \
hint. The package depends on the Emerald fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-2026.226.1.5svn36435-59.4.noarch.rpm"
RPM_HASH = "c669f90eda51c3a4955cee8f8acc6c68ebc16abc782f0a77f92a9443bcf46ce0680df8f41edd57e8e8acc9debc5e8e1deb2767c1919fee84d2ce8cd027cc1a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcookybooky.cfg \
tex-xcookybooky.sty \
texlive-xcookybooky"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cookingsymbols.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-ifsym.sty \
tex-ifthen.sty \
tex-lettrine.sty \
tex-picture.sty \
tex-tabulary.sty \
tex-tikz.sty \
tex-units.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
