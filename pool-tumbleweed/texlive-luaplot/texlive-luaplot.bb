SUMMARY = "Plotting graphs using Lua"
DESCRIPTION = "This package uses Lua to plot graphs of real-valued functions \
of a real variable in LaTeX. It furthermore makes use of the \
MetaPost system as well as the luamplib and luacode packages. \
It provides an easy way for plotting graphs of standard \
mathematical functions. There is no particular environment in \
the package for plotting graphs. It also works inside LaTeX \
floating environments, like tables and figures. The compilation \
time for plotting several graphs in LaTeX using this package is \
significantly less with the LuaLaTeX engine. The package is \
based on the core idea of loading mathematical functions inside \
Lua and determining plot points using different methods \
available in Lua. After determining plot points in Lua, two \
different approaches are used: Pass plot points to the MetaPost \
system via luamplib. Pass plot points to the TikZ package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn68918"

RPM_NAME = "texlive-luaplot-2026.226.1.5svn68918-59.2.noarch.rpm"
RPM_HASH = "f7d0dfca1f415eab7f9df4ffecfb0c4d81096c7ac3173383c095b7098060c693045d93154334b0b775e5d691d3cfd2063ce2e39f984dd66f912c4b6f57bbee11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaplot.sty \
texlive-luaplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-luamplib.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
