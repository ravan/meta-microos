SUMMARY = "A LaTeX class for typesetting letters and invoices"
DESCRIPTION = "The isodoc class can be used for the preparation of letters and \
invoices (and, in the future, similar documents). Documents are \
set up with options, thus making the class easily adaptable to \
user's wishes and extensible for other document types. The \
class is based on the NTG brief class by Victor Eijkhout, which \
implements the NEN1026 standard."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn75787"

RPM_NAME = "texlive-isodoc-2026.226.1.16svn75787-63.2.noarch.rpm"
RPM_HASH = "9a11bb5bbd64383f71721cba0ee0967321fddb90e92d6d97afe13b72743af98f40dc79955dfeb2d7fbcf584f31c42fcee09782cbc6f8241a0a94b648c119e268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isodoc.cls \
texlive-isodoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-forarray.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-longtable.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-tabularx.sty \
tex-textpos.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
