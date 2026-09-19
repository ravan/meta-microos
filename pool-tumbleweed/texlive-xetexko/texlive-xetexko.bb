SUMMARY = "Typeset Korean with Xe(La)TeX"
DESCRIPTION = "The package supports typesetting Korean documents (including \
old Hangul texts), using XeTeX. It enhances the existing \
support, in XeTeX, providing features that provide quality \
typesetting. This package requires the cjk-ko package for its \
full functionality."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6svn77682"

RPM_NAME = "texlive-xetexko-2026.226.4.6svn77682-59.4.noarch.rpm"
RPM_HASH = "6852952e86ed45169d73783956f9b9064cf3aabd12414897c88715bd32ddc80cee88665a83a9996f2b31f939df6cff68cc90df9496606fd424dd1f8b22e8161b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xetexko-font.sty \
tex-xetexko-hanging.sty \
tex-xetexko-josa.sty \
tex-xetexko-space.sty \
tex-xetexko-vertical.sty \
tex-xetexko.sty \
texlive-xetexko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
