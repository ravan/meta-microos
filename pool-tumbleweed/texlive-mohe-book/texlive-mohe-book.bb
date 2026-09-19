SUMMARY = "Typeset authored, translated, and research books according to mohe rules"
DESCRIPTION = "The mohe-book LaTeX class is a specialized template designed to \
streamline the typesetting of academic and educational \
materials, including authored textbooks, translated works, \
research publications, and course materials. Tailored for \
faculty members and academic staff in Afghanistan, it adheres \
to rigorous scholarly standards while offering customizable \
layouts for bilingual (e.g., Dari-English) or multilingual \
content. Key features include preconfigured chapter/section \
styles, support for complex scripts, and templates for front \
matter (prefaces, dedications) and back matter (bibliographies, \
indices). The package aims to simplify the creation of \
professional-grade academic documents, ensuring consistency and \
compliance with institutional or regional publishing \
guidelines."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn74912"

RPM_NAME = "texlive-mohe-book-2026.226.1.0.0svn74912-61.2.noarch.rpm"
RPM_HASH = "f3835af665b9c14cb25f7fe00312570d7b6dda80160b2f4145609138116759963b612fa4173456634bda4ee3f9f4e24e27106ff683586fd4538f08db4a1b08b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mohe-book.cls \
texlive-mohe-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amstext.sty \
tex-amsthm.sty \
tex-book.cls \
tex-caption.sty \
tex-cleveref.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fourier-orns.sty \
tex-geometry.sty \
tex-glossaries-extra.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-longfigure.sty \
tex-longtable.sty \
tex-makeidx.sty \
tex-mathtools.sty \
tex-multicol.sty \
tex-ptext.sty \
tex-tasks.sty \
tex-thmtools.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-totcount.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
