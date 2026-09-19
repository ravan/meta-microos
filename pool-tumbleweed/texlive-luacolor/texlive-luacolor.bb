SUMMARY = "Color support based on LuaTeX's node attributes"
DESCRIPTION = "This package implements color support based on LuaTeX's node \
attributes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.18svn77682"

RPM_NAME = "texlive-luacolor-2026.226.1.18svn77682-59.2.noarch.rpm"
RPM_HASH = "45da514afbe4474834cdd6e8147e5227eeb518da08a1fccd2e29db9251eca7966ef78a9327f6bc3b6983b45b4b384f60c54a6b301db99d13cdb6c1e49a5c943f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacolor.sty \
texlive-luacolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
