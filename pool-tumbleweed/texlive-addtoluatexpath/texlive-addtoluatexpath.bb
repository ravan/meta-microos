SUMMARY = "Add paths to Lua packages and input TeX files"
DESCRIPTION = "This package provides a convenient way to add input and Lua \
package paths in your document. You may want this package, for \
example, if a .cls or .sty file is located on a network or \
cloud storage drive."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73424"

RPM_NAME = "texlive-addtoluatexpath-2026.226.svn73424-61.2.noarch.rpm"
RPM_HASH = "f0720a6bc14853813753fd483ee2b0cd254d68811a020b3425e8fd6e4119aa7a87d06be1842923e987d95a8a05c43e430b2a58498a5ffe6adebcbb7aac76d23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addtoluatexpath.sty \
texlive-addtoluatexpath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
