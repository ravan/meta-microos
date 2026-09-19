SUMMARY = "Other languages"
DESCRIPTION = "Support for languages not otherwise listed, including Indic, \
Thai, Vietnamese, Hebrew, Indonesian, African languages, and \
plenty more. The split is made simply on the basis of the size \
of the support, to keep both collection sizes and the number of \
collections reasonable."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn74620"

RPM_NAME = "texlive-collection-langother-2026.222.svn74620-68.2.noarch.rpm"
RPM_HASH = "0fc7db541b8b166d7900a9812ff7eda2edf38b683378a2f08932829b1f0e7eb1109845d72ee1ff81d88bf5d6bab5ae20549b0872f2d24bc314f6253a1363eb98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
texlive-collection-langother"

RDEPENDS:${PN} += "texlive-aalok \
texlive-akshar \
texlive-amsldoc-vn \
texlive-aramaic-serto \
texlive-babel-azerbaijani \
texlive-babel-esperanto \
texlive-babel-georgian \
texlive-babel-hebrew \
texlive-babel-indonesian \
texlive-babel-interlingua \
texlive-babel-malay \
texlive-babel-sorbian \
texlive-babel-thai \
texlive-babel-vietnamese \
texlive-bangla \
texlive-bangtex \
texlive-bengali \
texlive-burmese \
texlive-chhaya \
texlive-cjhebrew \
texlive-collection-basic \
texlive-ctib \
texlive-culmus \
texlive-ethiop \
texlive-ethiop-t1 \
texlive-fc \
texlive-fonts-tlwg \
texlive-hebrew-fonts \
texlive-hindawi-latex-template \
texlive-hyphen-afrikaans \
texlive-hyphen-armenian \
texlive-hyphen-coptic \
texlive-hyphen-esperanto \
texlive-hyphen-ethiopic \
texlive-hyphen-georgian \
texlive-hyphen-hebrew \
texlive-hyphen-indic \
texlive-hyphen-indonesian \
texlive-hyphen-interlingua \
texlive-hyphen-sanskrit \
texlive-hyphen-thai \
texlive-hyphen-turkmen \
texlive-hyphen-vietnamese \
texlive-latex-mr \
texlive-latexbangla \
texlive-latino-sine-flexione \
texlive-lshort-thai \
texlive-lshort-vietnamese \
texlive-marathi \
texlive-ntheorem-vn \
texlive-quran-bn \
texlive-quran-id \
texlive-quran-ur \
texlive-sanskrit \
texlive-sanskrit-t1 \
texlive-thaienum \
texlive-thaispec \
texlive-tuzuk \
texlive-unicode-alphabets \
texlive-velthuis \
texlive-vntex \
texlive-wnri \
texlive-wnri-latex \
texlive-xetex-devanagari"

inherit rpm
