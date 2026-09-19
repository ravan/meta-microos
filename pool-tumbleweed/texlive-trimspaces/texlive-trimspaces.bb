SUMMARY = "Trim spaces around an argument or within a macro"
DESCRIPTION = "A very short package that allows you to expandably remove \
spaces around a token list (commands are provided to remove \
spaces before, spaces after, or both); or to remove surrounding \
spaces within a macro definition, or to define space-stripped \
macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-trimspaces-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "acef968e10ac977b5c6a70dcd234036ed83659c139bd917824a5e5f0056c2dbf4dce1eacc770bef8fcc79e19927334be59240a92fab3d7467ca90a3719c5f4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trimspaces.sty \
texlive-trimspaces"

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
