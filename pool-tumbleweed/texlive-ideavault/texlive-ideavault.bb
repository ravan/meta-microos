SUMMARY = "Idea (concept) management package"
DESCRIPTION = "This LuaLaTeX package provides tools for the management (i.e. \
creation and printing) of ideas (i.e. pieces of LaTeX code \
representing concepts). It supports dependencies, nested idea \
printing and tags, and can be useful for writing rulebooks or \
handbooks with many definitions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.5svn74773"

RPM_NAME = "texlive-ideavault-2026.226.1.0.5svn74773-60.2.noarch.rpm"
RPM_HASH = "3c8af8ae4bd4358c5a2941f0272374fe995196e43d31e23fb52c629d07cd8077dc3bbcfd86579fd57225422dadff469689f76d68e2ce965ded16a4abbc8cad70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ideavault.sty \
texlive-ideavault"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-luacode.sty \
tex-mdframed.sty \
tex-needspace.sty \
tex-xargs.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
