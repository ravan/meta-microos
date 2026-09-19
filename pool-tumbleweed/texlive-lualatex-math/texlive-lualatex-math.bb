SUMMARY = "Fixes for mathematics-related LuaLaTeX issues"
DESCRIPTION = "The package patches a few commands of the LaTeX2e kernel and \
the amsmath and mathtools packages to be more compatible with \
the LuaTeX engine. It is only meaningful for LuaLaTeX documents \
containing mathematical formulas, and does not exhibit any new \
functionality. The fixes are mostly moved from the unicode-math \
package to this package since they are not directly related to \
Unicode mathematics typesetting."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-lualatex-math-2026.226.1.12svn77682-59.2.noarch.rpm"
RPM_HASH = "07b75f9de9fc9b40b3a34703a9f940d098c54e3cdba414cba55137135321de058398eb5fd672aa1800f3e03a954870e6853160d8a7f38de2f7a55a8928cc4514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualatex-math.sty \
texlive-lualatex-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filehook.sty \
tex-luatexbase.sty \
texlive \
texlive-etoolbox \
texlive-filehook \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
