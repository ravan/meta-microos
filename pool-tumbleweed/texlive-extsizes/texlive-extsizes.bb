SUMMARY = "Extend the standard classes' size options"
DESCRIPTION = "Provides classes extarticle, extreport, extletter, extbook and \
extproc which provide for documents with a base font size from \
8-20pt. There is also a LaTeX package, extsizes.sty, which can \
be used with nonstandard document classes. But it cannot be \
guaranteed to work with any given class."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4asvn78101"

RPM_NAME = "texlive-extsizes-2026.226.1.4asvn78101-59.2.noarch.rpm"
RPM_HASH = "890922b86482ec200fa3293489b635908c99e32058e4bfc0a3bae0082741ddafb07d3590690f9ac30741d60d0a5d021b26b89e5606d947d52cd3a737f99ec3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopagewidth.sty \
tex-extarticle.cls \
tex-extbook.cls \
tex-extletter.cls \
tex-extproc.cls \
tex-extreport.cls \
tex-extsizes.sty \
tex-size14.clo \
tex-size17.clo \
tex-size20.clo \
tex-size8.clo \
tex-size9.clo \
texlive-extsizes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
