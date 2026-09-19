SUMMARY = "Portuguese"
DESCRIPTION = "Support for Portuguese and Brazilian Portuguese."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn73303"

RPM_NAME = "texlive-collection-langportuguese-2026.222.svn73303-68.2.noarch.rpm"
RPM_HASH = "b09a983ec69ddfc56c76c0ecbcf94308fc4f03c0656c867c05eab8b18548e7cf43ecc51d152f6383c0645ab32ca9389fd9622455babcd177854734c9b943e239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-portuguese \
texlive-collection-langportuguese"

RDEPENDS:${PN} += "texlive-babel-portuges \
texlive-beamer-tut-pt \
texlive-collection-basic \
texlive-cursolatex \
texlive-feupphdteses \
texlive-hyphen-portuguese \
texlive-latex-via-exemplos \
texlive-latexcheat-ptbr \
texlive-lshort-portuguese \
texlive-numberpt \
texlive-ordinalpt \
texlive-ptlatexcommands \
texlive-tabularray-abnt \
texlive-xypic-tut-pt"

inherit rpm
