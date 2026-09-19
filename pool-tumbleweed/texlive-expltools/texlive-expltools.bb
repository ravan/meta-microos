SUMMARY = "Development tools for expl3 programmers"
DESCRIPTION = "This bundle introduces explcheck, a static analysis tool for \
developers working with expl3 code. Currently in its initial \
release, explcheck aims to help developers identify potential \
issues and improve code quality. In the future, this bundle may \
expand to include additional development tools for expl3."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77605"

RPM_NAME = "texlive-expltools-2026.226.svn77605-59.2.noarch.rpm"
RPM_HASH = "e684699bd6793a34c69e08c9ac9da1daadaf6765230b2f07c8c2fb52132c79c35b2d1ef01d166082f731198b4c695580e5f38d0c95858465557545e137086fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expltools"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-expltools-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
