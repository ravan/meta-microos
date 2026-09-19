SUMMARY = "Comprehensive ligature suppression functionalities"
DESCRIPTION = "This package suppresses inappropriate ligatures following \
specified rules. Both font and user kerning are applied \
correctly, and f-glyphs are automatically replaced with their \
short-arm variant (if available). Also there is an emphasis on \
speed. By default the package applies German language ligature \
suppression rules. With the help of options and macros it can \
be used for other languages as well. The package requires \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn67601"

RPM_NAME = "texlive-ligtype-2026.226.0.0.3svn67601-61.2.noarch.rpm"
RPM_HASH = "be24966f95dec38d85e87203b4d96d9b01b60f80d2252f0efc15e831ff9ad93a291c352a57ac9d6e00dbb0f005a0e5bce63de9e74326402f87783e0c1db1a5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ligtype.sty \
texlive-ligtype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
