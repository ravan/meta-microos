SUMMARY = "Fixed date-stamps with LuaLaTeX"
DESCRIPTION = "Add fixed date-stamps with simple and customizable aux files \
and LuaLaTeX. As long as the aux file is not deleted/modified \
the date-stamp generated with this package remains intact."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn61719"

RPM_NAME = "texlive-datestamp-2026.226.0.0.3svn61719-61.2.noarch.rpm"
RPM_HASH = "fee1ad95be9e994eb73d11062321b0bbb231959c747d36ad6b947fe4220856ce3d5823eb1260f1a4178e949e0a5bc29bea57c02df423ff131a514cabcf3f4b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datestamp.sty \
texlive-datestamp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
