SUMMARY = "Convert common unicode symbols to LaTeX code"
DESCRIPTION = "The aim of this LaTeX package is to provide a complete as \
possible list of common Unicode symbols with their translations \
to LaTeX code. This is useful in the development of templates \
which are intended to work with modern TeX engines (LuaTeX, \
XeTeX) as well as traditional ones (TeX, pdfTeX)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn62901"

RPM_NAME = "texlive-commonunicode-2026.226.1.0.0svn62901-60.2.noarch.rpm"
RPM_HASH = "d34a550027319cee2e5e383baa545c72bc69c2b84f70497bea5d9255f6c367c63a0a2c84af44200ea10be8417c07f79cb06c84a7290f5458cb5b2c15678df61b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commonunicode.sty \
texlive-commonunicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-stmaryrd.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
