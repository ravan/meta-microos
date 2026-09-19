SUMMARY = "Typesetting telephone numbers with LaTeX"
DESCRIPTION = "The phonenumbers package makes it possible to typeset telephone \
numbers according to different national conventions. German, \
Austrian, French, British and North American phone numbers are \
supported. Phone numbers from other countries are supported \
rudimentarily. The user can select from various formatting \
options, including the additional output of the country calling \
code. The package is able to check if a phone number is valid \
according to the national rules. It also allows to link phone \
numbers using the hyperref package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn77682"

RPM_NAME = "texlive-phonenumbers-2026.226.2.6svn77682-58.2.noarch.rpm"
RPM_HASH = "ad736e4e52c617a0e1ea3eb955171a82606c46f7c81a6dd3a3b2d88bc5ec5d7264dc177b026f8197f36bc66596edd387b57bea8d001f88e3d925b84778a98562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phonenumbers-AT.def \
tex-phonenumbers-DE.def \
tex-phonenumbers-FR.def \
tex-phonenumbers-UK.def \
tex-phonenumbers-US.def \
tex-phonenumbers.sty \
texlive-phonenumbers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
