SUMMARY = "System queries for LaTeX using Lua"
DESCRIPTION = "The l3sys-query script provides a method for TeX runs to obtain \
system information via shell escape to Lua. The facilities are \
more limited than the similar Java script texosquery, but since \
it uses Lua, l3sys-query can be used out of the box; with any \
installed TeX system. The script is written taking account of \
TeX Live security requirements; it is therefore suitable for \
use with restricted shell escape, the standard setting when \
installing a TeX system. The supported queries are lsDirectory \
listing supporting a range of options pwdObtaining details of \
the current working directory"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-l3sys-query-2026.226.svn77682-63.2.noarch.rpm"
RPM_HASH = "3844e2c161fad0a351926de0503c0d652cbedccda1ec32c78bb64b05aae152dc289491ad244118706beb7a30bd1753eba84d126b2c8dbbc73c8803f3f324bad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3sys-query"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3sys-query-bin \
texlive-luatex \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
