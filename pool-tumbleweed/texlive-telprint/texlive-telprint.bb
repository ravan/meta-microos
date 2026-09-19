SUMMARY = "Format German phone numbers"
DESCRIPTION = "The package provides a command \\telprint for formatting German \
telephone numbers."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.12svn77682"

RPM_NAME = "texlive-telprint-2026.227.1.12svn77682-62.2.noarch.rpm"
RPM_HASH = "6900498c04bfb1af1a401f04f2b6b1ca91a92b7feece5a45eaa3165b1740a4a2250975feee68d815315f7e0adaa1377d222e1240a906326119e9b7df661b705b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-telprint.sty \
texlive-telprint"

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
