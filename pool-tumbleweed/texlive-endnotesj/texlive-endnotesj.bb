SUMMARY = "Japanese-style endnotes"
DESCRIPTION = "This package provides customized styles for endnotes to be used \
with Japanese documents. It can be used on pLaTeX, upLaTeX, and \
LuaLaTeX (LuaTeX-ja)."
LICENSE = "BSD-3-Clause"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-endnotesj-2026.226.3.0svn77682-61.4.noarch.rpm"
RPM_HASH = "ba740dd1896ee71be2df2eb8972f7ac8af4ed69b4fb84cdd03b340fc6db0e3355d3419aa97fcf55b2cba75ab2f9be6c3cc25e3c1ba4e5efb95a6b5d3f52190c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotesj.sty \
texlive-endnotesj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-endnotes.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
