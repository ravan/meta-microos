SUMMARY = "An enhancement to the lscape and pdflscape packages"
DESCRIPTION = "The package solves an issue with the detection of text height, \
e.g., by package scrlayer or showframe, when using the \
landscape environment of package lscape or pdflscape."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn70967"

RPM_NAME = "texlive-lscapeenhanced-2026.226.1.0svn70967-61.2.noarch.rpm"
RPM_HASH = "97d9c6c38f1478dd39f275b1f2f6e581a2a7ad81842b16e924adb57979a40e3449caffbca233adcb2e24eea81e9818eab98ab9c3c5b12664f9d8272612ddf676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lscapeenhanced.sty \
texlive-lscapeenhanced"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
