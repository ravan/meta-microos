SUMMARY = "A LaTeX package for referencing groups of pages that share something in common"
DESCRIPTION = "Here Applies is a LaTeX package that allows to collect groups \
of labels and reference them altogether. It can be used for \
creating informal glossaries that cross-link concepts to their \
applications, or simply mentioning multiple pages that share \
something in common."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.2svn68638"

RPM_NAME = "texlive-hereapplies-2026.226.1.0.2svn68638-60.4.noarch.rpm"
RPM_HASH = "efc6b41ab92986f810044df873cdc941e9a036c7a2babab9507590c662f8a8b5557ba17600b4aaa04792dcde063e5dd98a4bc9ae28122cc20b02bbafd3d9a965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hereapplies.sty \
texlive-hereapplies"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
