SUMMARY = "Unicode Collation Algorithm library for Lua"
DESCRIPTION = "The Lua-UCA library provides basic support for Unicode \
Collation Algorithm in Lua. It can be used to sort arrays of \
strings according to rules of particular languages. It can be \
used in other Lua projects that need to sort text in a language \
dependent way, like indexing processors, bibliographic \
generators, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1esvn74807"

RPM_NAME = "texlive-lua-uca-2026.226.0.0.1esvn74807-59.2.noarch.rpm"
RPM_HASH = "4bf2374de0672784e6d1ccaa34369b9626de0c23ba13c216e944991204971b8e1f80fe3d29066cafc804d4576cabfc7710df183ba6479d60b6094abe7a99cd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uca"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
