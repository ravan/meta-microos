SUMMARY = "Generic symbols for both text and math mode"
DESCRIPTION = "Provides generic commands \\degree, \\celsius, \\perthousand, \
\\micro and \\ohm which work both in text and maths mode. Various \
means are provided to fake the symbols or take them from \
particular symbol fonts, if they are not available in the \
default fonts used in the document. This should be perfectly \
transparent at user level, so that one can apply the same \
notation for units of measurement in text and math mode and \
with arbitrary typefaces. Note that the package has been \
designed to work in conjunction with units.sty. This package \
used to be part of the was bundle, but has now become a package \
in its own right."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77682"

RPM_NAME = "texlive-gensymb-2026.226.1.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "e9b6cca8616d8f9a80cab69d503dd2f9487adb538a44c2ec2a1c323735de773411b4916a3230e817c6a3d701803391f3a26880919454d3f9c19de4f055101cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gensymb.sty \
texlive-gensymb"

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
