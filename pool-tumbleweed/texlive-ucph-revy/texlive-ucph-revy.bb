SUMMARY = "Musical script formatting"
DESCRIPTION = "This package provides a class for typesetting scripts \
containing both lyrics and prose, in the style used by the \
student revues (revy) at the Faculties of Science at the \
University of Copenhagen (uchp)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn74857"

RPM_NAME = "texlive-ucph-revy-2026.226.1.2.0svn74857-60.2.noarch.rpm"
RPM_HASH = "ad8a0ef8440bb521753a89b75b549506a223a4f1d7ef37b5987926195afc1055038ca6daa05a2b447c655add653218d32223fa885ca77ea79e16b42858809249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucph-revy.cls \
texlive-ucph-revy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-refcount.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
