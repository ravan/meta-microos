SUMMARY = "LaTeX recommended packages"
DESCRIPTION = "A collection of recommended add-on packages for LaTeX which \
have widespread use."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77082"

RPM_NAME = "texlive-collection-latexrecommended-2026.222.svn77082-68.2.noarch.rpm"
RPM_HASH = "561da3a40debebbc82b1527bde68ab28c691e552b4651f75f52576e9c134d21f75f54e7d8e24e4e5ac8c568abf36405b3ad5f0dde70bf615fc8fb0befa939511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-latexrecommended \
texlive-collection-latexrecommended"

RDEPENDS:${PN} += "texlive-anysize \
texlive-attachfile2 \
texlive-beamer \
texlive-booktabs \
texlive-breqn \
texlive-caption \
texlive-cite \
texlive-cmap \
texlive-collection-latex \
texlive-crop \
texlive-ctable \
texlive-eso-pic \
texlive-euenc \
texlive-euler \
texlive-everysel \
texlive-everyshi \
texlive-extsizes \
texlive-fancybox \
texlive-fancyref \
texlive-fancyvrb \
texlive-filehook \
texlive-float \
texlive-fontspec \
texlive-footnotehyper \
texlive-fp \
texlive-grffile \
texlive-hologo \
texlive-index \
texlive-infwarerr \
texlive-jknapltx \
texlive-koma-script \
texlive-l3experimental \
texlive-latexbug \
texlive-lineno \
texlive-listings \
texlive-ltx-talk \
texlive-lua-unicode-math \
texlive-lwarp \
texlive-mathspec \
texlive-mathtools \
texlive-mdwtools \
texlive-memoir \
texlive-metalogo \
texlive-microtype \
texlive-newfloat \
texlive-ntgclass \
texlive-parskip \
texlive-pdfcolfoot \
texlive-pdflscape \
texlive-pdfmanagement-testphase \
texlive-pdfpages \
texlive-polyglossia \
texlive-psfrag \
texlive-ragged2e \
texlive-rcs \
texlive-sansmath \
texlive-section \
texlive-seminar \
texlive-sepnum \
texlive-setspace \
texlive-subfig \
texlive-textcase \
texlive-thumbpdf \
texlive-translator \
texlive-typehtml \
texlive-ucharcat \
texlive-underscore \
texlive-unicode-math \
texlive-xcolor \
texlive-xfrac \
texlive-xkeyval \
texlive-xltxtra \
texlive-xunicode"

inherit rpm
