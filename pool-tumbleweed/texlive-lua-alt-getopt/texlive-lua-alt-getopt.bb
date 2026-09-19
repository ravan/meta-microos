SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "lua_altgetopt is a MIT-licensed module for Lua, for processing \
application arguments in the same way as BSD/GNU getopt_long(3) \
functions do. This module is made available for lua script \
writers to have consistent command line parsing routines."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn56414"

RPM_NAME = "texlive-lua-alt-getopt-2026.226.0.0.7.0svn56414-59.2.noarch.rpm"
RPM_HASH = "a77550534f220138ff27ea88c34dd59cbf762b425e9c8a28a9e68042e6091ae7ec91b5bd10eaca805646a782dbe15be34516eb73a33460ea485a4e83dc2ede31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-alt-getopt"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
