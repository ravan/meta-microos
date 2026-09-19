SUMMARY = "Emoji for all (LaTeX engines)"
DESCRIPTION = "Emo implements the \\emo{'emoji-name'} command for including \
color emoji such as [?] (\\emo{desert-island}) or [?] \
(\\emo{parrot}) in your documents independent of input encoding \
or LaTeX engine. The implementation uses the Noto color emoji \
font if the engine supports it and includes PDF graphics \
otherwise. The latter are automatically derived from Noto's SVG \
sources, so the visual appearance is very similar. Emo may come \
in particularly handy when dealing with academic publishers \
that provide only minimal support for non-Latin scripts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-emo-2026.226.0.0.4svn77682-61.4.noarch.rpm"
RPM_HASH = "cdcf2205f7d64b5486b7375b6afd73ec4f9e6f4c77f3b2d635f568fe6325f11ceebe53caf3725cae05a00086f48c79581639e831aed238406f70ae35d9e50d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emo.def \
tex-emo.sty \
texlive-emo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-index.sty \
tex-inputenc.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-emo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
