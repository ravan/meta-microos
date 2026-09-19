SUMMARY = "Typeset notes containing rich content, in the margin"
DESCRIPTION = "The package allows typesetting of texts with notes, figures, \
citations, captions and tables in the margin. This is common \
(for example) in science text books."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn77682"

RPM_NAME = "texlive-sidenotes-2026.226.1.20svn77682-60.2.noarch.rpm"
RPM_HASH = "e78ac0d9a6f26818e22a6c3db7e74070bda1ab3a7afc00a77562ea7a7568f4f390ba9ed9a31d1e7af595d0d3c1bb7db492bd02bc02ad2d986fff3e648b1e6b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-caesar-book.cls \
tex-sidenotes.sty \
texlive-sidenotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beramono.sty \
tex-caption.sty \
tex-changepage.sty \
tex-color.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-marginfix.sty \
tex-marginnote.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-ragged2e.sty \
tex-textcase.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
