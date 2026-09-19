SUMMARY = "Access OpenType subscript and superscript glyphs"
DESCRIPTION = "This small package replaces \\textsuperscript and \\textsubscript \
commands by equivalent commands that use OpenType font features \
to access appropriate glyphs if possible. The package also \
patches LaTeX's default footnote command to use this new \
\\textsuperscript for footnote symbols. The package requires \
fontspec running on either XeLaTeX or LuaLaTeX. The package \
holds functions that were once parts of the xltxtra package, \
which now loads realscripts by default."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3dsvn77682"

RPM_NAME = "texlive-realscripts-2026.226.0.0.3dsvn77682-60.4.noarch.rpm"
RPM_HASH = "b5a7c1ae22c1082fbc3fc7408c50ecae75e63161ed79394db0c31e799f20a5f72337e353bfb2ceef7bd3fb0c3ccfa198e38b0bb5040bfca7567e12c229854d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realscripts.sty \
texlive-realscripts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
