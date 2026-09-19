SUMMARY = "Compile-time internet-interactive PDF-documents using Lua and LuaTeX"
DESCRIPTION = "This small package provides five commands to make HTTP requests \
using Lua and LuaTeX. Functionalities include API calls, fetch \
RSS feeds and the possibility to include images using a link. \
These commands run during the compilation of the PDF-Document \
and may require user interaction."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn67348"

RPM_NAME = "texlive-luahttp-2026.226.1.0.1svn67348-59.2.noarch.rpm"
RPM_HASH = "4acf012c4eecc2de62ea76f708e645ef3ec0e0ba99c3f0120992fe1e7d8116ea4032f4ecef7e03c7ef95e7d7e8e36feb5c901c6adb0463a43affd17cfbbcd0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luahttp.sty \
texlive-luahttp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luapackageloader.sty \
tex-url.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
