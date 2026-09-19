SUMMARY = "Simple creation of commands with key-value arguments"
DESCRIPTION = "The package (which requires e-TeX) provides a natural way to \
define commands with optional keys. The package provides \
\\newkeycommand, \\renewkeycommand, \\providekeycommand, \
\\newkeyenvironment and \\renewkeyenvironment, together with \
\\keycmd for a more advanced interface. The package is based on \
kvsetkeys by Heiko Oberdiek."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1415svn78101"

RPM_NAME = "texlive-keycommand-2026.226.3.1415svn78101-63.2.noarch.rpm"
RPM_HASH = "28f60bd4460bba5f60888d284a487f0129ae2180b0b3b7a521aeb77ca3f8a9c8cb55a9455162f8e48f1787b526ddbeb7d00fb0e5c30aab2081543cf478eced30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keycommand.sty \
texlive-keycommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-kvsetkeys.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
