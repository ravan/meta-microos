SUMMARY = "Produce bracketed identification keys"
DESCRIPTION = "The package provides an environment bracketkey for use when \
producing lists of species."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17129"

RPM_NAME = "texlive-bracketkey-2026.226.1.0svn17129-59.2.noarch.rpm"
RPM_HASH = "86ea93e5b68888b2ec37cf77c489c854f4949c4724d5d3b89d610bef6c534438a0648ea8097f4c7774227d24a03a4aee5d9760a3324ba2d05b22bfe755345f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bracketkey.sty \
texlive-bracketkey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-coolstr.sty \
tex-hyperref.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
