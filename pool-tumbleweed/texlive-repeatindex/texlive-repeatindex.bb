SUMMARY = "Repeat items in an index after a page or column break"
DESCRIPTION = "This Package repeats item of an index if a page or column break \
occurs within a list of subitems. This helps to find out to \
which main item a subitem belongs."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-repeatindex-2026.226.0.0.01svn77682-60.4.noarch.rpm"
RPM_HASH = "1f18111bf360ce01fc490b98de141680b7af67a0b7f9773d9662100e7ec92593d2a2ef089518cdb4a376910be498414bddb3abd8f806902f9106448464415dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-repeatindex.sty \
texlive-repeatindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-makeidx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
