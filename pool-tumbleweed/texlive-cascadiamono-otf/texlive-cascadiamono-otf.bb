SUMMARY = "Fontspec support for the OpenType font CascadiaMono"
DESCRIPTION = "Support for the OpenType font CascadiaMono (so with \
LuaLaTeX/XeTeX and fontspec), which is a variant of \
CascadiaCode, but without ligatures. \\setmonofont{CascadiaMono} \
for regular version, \\setmonofont{CascadiaMono-SemiLight} for \
semilight version. \\setmonofont{CascadiaMono-Light} for light \
version, \\setmonofont{CascadiaMono-ExtraLight} for extralight \
version."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-cascadiamono-otf-2026.226.0.0.3svn77682-59.2.noarch.rpm"
RPM_HASH = "e66872fd632bd55140688a448f97f2505d3bb7a06ff8fe5b0c2019be3bb996935fe3b22f28f2daed270fc6493a5e6c698568b6d4009c9ee6ce5b2a0cf8207908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cascadiamono-otf.sty \
texlive-cascadiamono-otf"

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
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
