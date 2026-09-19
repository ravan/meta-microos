SUMMARY = "Font containing a set of web-related icons"
DESCRIPTION = "This package grants access to 336 web-related icons provided by \
the included 'Typicons' free font, designed by Stephen \
Hutchings and released under the SIL Open Font License. See \
http://www.typicons.com for more details about the font itself. \
This package requires the fontspec package and either the \
Xe(La)TeX or Lua(La)TeX engine to load the included ttf font. \
Once the package is loaded, icons can be accessed through the \
general \\ticon command, which takes as argument the name of the \
desired icon, or through direct commands specific to each icon. \
The full list of icon designs, names and direct commands is \
showcased in the manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn77682"

RPM_NAME = "texlive-typicons-2026.226.2.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "00f793edfe577935b6a1aae5b978eb156fc0be86f51023303b77bc6e1d84be2282ebcffd2521dfdb00f02091acb0ccfaa7221d9d2361a5add8da74544af902ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typicons.sty \
texlive-typicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-typicons-fonts"

inherit rpm
