SUMMARY = "Unicode normalization support"
DESCRIPTION = "This package provides Unicode normalization (useful for \
composed characters) for LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-uninormalize-2026.226.0.0.1svn78101-60.2.noarch.rpm"
RPM_HASH = "1533037f9d5099884705bb06305ba39cd95e24ac10f88f0867d6661324bea6fd10421bb56ae2848131958cce377a9bf39f41fc9a92d717ee30067e411624e040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uninormalize.sty \
texlive-uninormalize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
