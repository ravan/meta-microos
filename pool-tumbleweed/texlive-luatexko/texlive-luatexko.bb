SUMMARY = "Typeset Korean with Lua(La)TeX"
DESCRIPTION = "This is a Lua(La)TeX macro package that supports typesetting \
Korean documents including Old Hangul texts. As LuaTeX has \
opened up access to almost all the hidden routines of TeX \
engine, users can obtain more beautiful outcome using this \
package rather than other Hangul macros operating on other \
engines. LuaTeX version 1.10+ and luaotfload version 2.96+ are \
required for this package to run. This package also requires \
the cjk-ko package for its full functionality."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.7svn78005"

RPM_NAME = "texlive-luatexko-2026.226.5.7svn78005-59.2.noarch.rpm"
RPM_HASH = "9b6c9d5cbbac45bfaf563e2e954e6e7d731fb36e1e3b78913158ec67da19906c8adeedd155efaf81534de8d407080d6bbff72940ee912138ecc7809e0e4f0602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatexko.sty \
texlive-luatexko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-fontspec.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
tex-luaotfload.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
