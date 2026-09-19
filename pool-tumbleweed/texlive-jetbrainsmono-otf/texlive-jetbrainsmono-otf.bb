SUMMARY = "Package (or only fontspec config files) support for the OpenType font JetBrains"
DESCRIPTION = "Support for the OpenType font JetBrainsMono (so with \
LuaLaTeX/XeTeX and fontspec),with or without ligatures, and \
with weights versions. jetbrainsmono or jetbrainscode for \
regular version, jetbrainsmono-medium or jetbrainscode-medium \
for medium version, jetbrainsmono-light or jetbrainscode-light \
for light version, jetbrainsmono-extralight or \
jetbrainscode-extralight for extralight version, \
jetbrainsmono-thin or jetbrainscode-thin for thin version."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-jetbrainsmono-otf-2026.226.0.0.1svn77682-63.2.noarch.rpm"
RPM_HASH = "8d56ff110eb689027cd10386d9376992c4110099e17f76880c530b26b572d5349a5e01a18af0e22e2758ca0d256a06b8d20e9fc19d20c4ef8b29a3277c335319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jetbrainsmono-otf.sty \
texlive-jetbrainsmono-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-jetbrainsmono-otf-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
