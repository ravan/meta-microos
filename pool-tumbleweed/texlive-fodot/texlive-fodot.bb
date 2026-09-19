SUMMARY = "Helpful commands to work with the FODOT"
DESCRIPTION = "This package provides helpful commands to work with the fodot \
language in LaTeX including syntax highlighting in listings. \
The fodot language itself is not introduced. Instead, please \
refer to the official documentation: Official documentation of \
fodot: https://fo-dot.readthedocs.io/en/latest/FO-dot.html \
Technical implementation of fodot: \
https://docs.idp-z3.be/en/stable/introduction.html Reasoning \
engine IDP-Z3 (using fodot): https://idp-z3.be/."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn76255"

RPM_NAME = "texlive-fodot-2026.226.0.0.0.1svn76255-60.2.noarch.rpm"
RPM_HASH = "e779b654664818a6a56cc994fc607ffa4b29dee2a4bfee16ea952b41ddddf9151a25c2ffa012d917cb835ad333d64391adbd5f3ff2e39a1af37b0b02275c51a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fodot.sty \
texlive-fodot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-listings.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
