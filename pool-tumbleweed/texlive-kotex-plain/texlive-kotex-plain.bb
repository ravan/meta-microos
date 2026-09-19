SUMMARY = "Macros for typesetting Korean under Plain TeX"
DESCRIPTION = "The package provides macros for typesetting Hangul, the native \
alphabet of the Korean language, using plain *TeX. Input Korean \
text should be encoded in UTF-8. The package belongs to the \
ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn63689"

RPM_NAME = "texlive-kotex-plain-2026.226.3.0.0svn63689-63.2.noarch.rpm"
RPM_HASH = "60aab72b992ff1138277c5d876b0843506e37fe4bbe6fcd7a88c59f9947d96101c3f4787f750893702e5d19a88748d13ef9fc20c9d259826fd40b96a35a52d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hangulcweb.tex \
tex-kotexplain.tex \
tex-kotexutf-core.tex \
tex-kotexutf.tex \
texlive-kotex-plain"

RDEPENDS:${PN} += "/usr/bin/sh \
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
