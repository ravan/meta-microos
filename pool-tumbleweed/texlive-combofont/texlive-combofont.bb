SUMMARY = "Add NFSS-declarations of combo fonts to LuaLaTeX documents"
DESCRIPTION = "This highly experimental package can be used to add \
NFSS-declarations of combo fonts to LuaLaTeX documents. This \
package may disappear without notice, e.g. if luaotfload \
changes in a way so that it no longer works, or if LuaTeX \
changes, or if fontspec itself includes the code. It is also \
possible that the package's syntax and commands may change in \
an incompatible way. So if you use it in a production \
environment: You have been warned."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn51348"

RPM_NAME = "texlive-combofont-2026.226.0.0.3svn51348-60.2.noarch.rpm"
RPM_HASH = "a6f1acc4a2d5cff3946008dd359144869b27b3ed6cf1a5a7e26f350fbf642543e54ba0c3764f09752f99c90ffeaf8fbdb9eaefc9a0db5896bc06fed76dfc1c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combofont.sty \
texlive-combofont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
