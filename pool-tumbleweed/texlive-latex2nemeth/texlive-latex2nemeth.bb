SUMMARY = "Convert LaTeX source to Braille with math in Nemeth"
DESCRIPTION = "After many failed attempts to transcribe real math notes and \
books to Braille/Nemeth in order to deal with a real situation \
(blind student in Math Dept.), we decided to develop a new \
program that follows a direct, from LaTeX to Braille/Nemeth, \
approach. Our main target was the Greek language which is only \
Braille level 1, but English at level 1 is supported as well. \
Simple pictures in PSTricks are also supported in order to \
produce tactile graphics with specialized equipment. Note that \
embossing will need LibreOffice and odt2braille as this project \
does not deal with embossers' drivers. What's new in version \
1.1 In this version, the support of the user level commands of \
the amsmath package was added, as described in its user guide, \
with the exception of commutative diagrams (amscd package) as \
well as structures that are irrelevant to visually impaired \
persons. Also, the Unicode mathematics symbols of the \
unicode-math package that are represented by the Nemeth code \
are now supported by latex2nemeth. We would like to acknowledge \
support by TUG's TeX development fund for this project \
(development fund project 33)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.3svn76924"

RPM_NAME = "texlive-latex2nemeth-2026.226.1.1.3svn76924-61.2.noarch.rpm"
RPM_HASH = "a30b646cfefefac3206ece6c5d41307a7eda379688e9560c2726e312aa82df9b36327dd5e510a53fd24ca1ca90a9bafd81d50940b720fc7d7b72ce34dc8bf64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latex2nemeth.jar \
texlive-latex2nemeth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex2nemeth-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
