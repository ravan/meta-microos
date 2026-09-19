SUMMARY = "Enhanced implementation of the \\meaning primitive"
DESCRIPTION = "This experimental package extends TeX's \\meaning primitive by \
delivering clearer, token-specific output linked to the given \
argument. A starred variant is also implemented to reveal the \
meaning of internal macros, making it easier to retrieve the \
true replacement text of xparse-defined macros and other \
complex macro structures."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn77128"

RPM_NAME = "texlive-xmeaning-2026.226.0.0.1.0svn77128-59.4.noarch.rpm"
RPM_HASH = "70b87c08bf06cd28718ff2810f5633dcda0b235c4e796a699929502d9d8b146b747dffe478e32ca0ec1fa4732e53fabe4defa6d788d1f9bc29b4ad5bb5b83e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmeaning.sty \
texlive-xmeaning"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
