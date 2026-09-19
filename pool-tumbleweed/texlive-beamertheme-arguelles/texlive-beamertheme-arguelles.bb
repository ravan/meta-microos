SUMMARY = "Simple, typographic beamer theme"
DESCRIPTION = "Arguelles is a beamer theme that helps you create beautiful \
presentations. It aims for simplicity and readability by \
following best practices of graphic design. The layout is \
elegant but subtle, so as to keep the audience's attention on \
your content. This is brought to life by Alegreya, one of the \
53 Fonts of the Decade selected by the Association \
Typographique Internationale (2011)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.0svn76524"

RPM_NAME = "texlive-beamertheme-arguelles-2026.226.2.5.0svn76524-61.2.noarch.rpm"
RPM_HASH = "ab2b54296556f9ef03f46e6bc5ae043acad22789f26bbbc5932bb89d16a3ab0c9d9c8115a6f1982c521797cf043b2b0ea5a59b5b79f43c7f984c65b05a60ae34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeArguelles.sty \
tex-beamerfontthemeArguelles.sty \
tex-beamerinnerthemeArguelles.sty \
tex-beamerouterthemeArguelles.sty \
tex-beamerthemeArguelles.sty \
texlive-beamertheme-arguelles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-Alegreya.sty \
tex-AlegreyaSans.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-eulervm.sty \
tex-fontawesome5.sty \
tex-fontenc.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-mathalpha.sty \
tex-microtype.sty \
tex-opencolor.sty \
tex-parskip.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
