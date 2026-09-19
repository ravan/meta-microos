SUMMARY = "Option handling for LuaLaTeX packages"
DESCRIPTION = "This LuaLaTeX package provides extensive support for handling \
options, on package level and locally. It allows the \
declaration of sets of options, along with defaults, \
expected/allowed values and limited type checking. These \
options can be enforced as package options, changed at any \
point during a document, or overwritten locally by optional \
macro arguments. It is also possible to instantiate an Options \
object as an independent Lua object, without linking it to a \
package. Luaoptions can be used to enforce and prepopulate \
options, or it can be used to simply handle the parsing of \
optional key=value arguments into proper Lua tables."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn78101"

RPM_NAME = "texlive-luaoptions-2026.226.0.0.8svn78101-59.2.noarch.rpm"
RPM_HASH = "40acf4a56755681c8e6a1778c96cd0b02e330e72c89f6a821c0c6df0f91f3e5b7023ba36bf4fc0a0c9ae34357e35102b057bf976c1b7a579953477bb8446ec65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaoptions.sty \
texlive-luaoptions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luaotfload.sty \
tex-luatexbase.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
