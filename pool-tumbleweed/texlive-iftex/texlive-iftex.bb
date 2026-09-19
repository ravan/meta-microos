SUMMARY = "Am I running under pdfTeX, XeTeX or LuaTeX?"
DESCRIPTION = "The package, which works both for Plain TeX and for LaTeX, \
defines the \\ifPDFTeX, \\ifXeTeX, and \\ifLuaTeX conditionals for \
testing which engine is being used for typesetting. The package \
also provides the \\RequirePDFTeX, \\RequireXeTeX, and \
\\RequireLuaTeX commands which throw an error if pdfTeX, XeTeX \
or LuaTeX (respectively) is not the engine in use."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0gsvn77682"

RPM_NAME = "texlive-iftex-2026.226.1.0gsvn77682-60.2.noarch.rpm"
RPM_HASH = "3bb3a7a0bbb3b36b40332bb7cb0cfc8a58c81d5dc4b8cebe21199249def7ac3033ec1d17bfcfca8ae55cd92888b7bd4a84858676fc47327c6f1be76fca1c9327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifetex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
texlive-iftex"

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
