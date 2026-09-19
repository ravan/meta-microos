SUMMARY = "Type definitions for the Lua API of LuaTeX"
DESCRIPTION = "LuaTeX has a very large Lua API. This project tries to make \
this API accessible in the text editor of your choice. This is \
made possible by the lua-language-server -- a server that \
implements the Language Server Protocol (LSP) for the Lua \
language. Features such as code completion, syntax \
highlighting, and marking of warnings and errors should \
therefore not only be possible in Visual Studio Code, but in a \
large number of editors that support the LSP."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.0svn75890"

RPM_NAME = "texlive-luatex-type-definitions-2026.226.0.0.2.0svn75890-59.2.noarch.rpm"
RPM_HASH = "0e8916a85079eead593867216648741208914fb436ec5776765a7fb7f29d71d6b14e8cb81eb117caf026fddabc2c93fe3ba56393be37b0652c7a0bd5a03d92c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatex-type-definitions"

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
