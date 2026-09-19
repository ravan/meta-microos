SUMMARY = "Draw barcodes with Lua"
DESCRIPTION = "The barracuda library is a modular Lua package for drawing \
barcode symbols. It provides modules for writing barcodes from \
a LuaTeX document. It is also possible to use Barracuda with a \
standalone Lua interpreter to draw barcodes in different \
graphic formats like SVG."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.0.12svn63708"

RPM_NAME = "texlive-barracuda-2026.226.0.0.0.12svn63708-60.2.noarch.rpm"
RPM_HASH = "b6d4f22d2a53bde7159e98eb2640753613c1bbff91bdf947af94586ca932ff3bfd648c28d104ec52f54a0dc5efd9e31d481d082be13123eb6520aad8cdb82b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-barracuda.sty \
texlive-barracuda"

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
