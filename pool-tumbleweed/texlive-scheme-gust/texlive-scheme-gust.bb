SUMMARY = "GUST TeX Live scheme"
DESCRIPTION = "This is the GUST TeX Live scheme: it is a set of files \
sufficient to typeset Polish plain TeX, LaTeX and ConTeXt \
documents in PostScript or PDF."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn59755"

RPM_NAME = "texlive-scheme-gust-2026.222.svn59755-68.2.noarch.rpm"
RPM_HASH = "3669a1266958b292aef8b66422015b06b4e96e23800f391e8580bd982551d168edeab08ca7c19d8714aaabdd38330affd3caba7e934e5b251798e9d139ad2ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-gust \
texlive-scheme-gust"

RDEPENDS:${PN} += "texlive-amslatex-primer \
texlive-amstex \
texlive-antt \
texlive-bibtex8 \
texlive-collection-basic \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-langpolish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-metapost \
texlive-collection-plaingeneric \
texlive-collection-xetex \
texlive-comment \
texlive-comprehensive \
texlive-concrete \
texlive-cyklop \
texlive-dvidvi \
texlive-dviljk \
texlive-fontinstallationguide \
texlive-gustprog \
texlive-impatient \
texlive-iwona \
texlive-metafont-beginners \
texlive-metapost-examples \
texlive-poltawski \
texlive-seetexk \
texlive-seminar \
texlive-tds \
texlive-tex4ht \
texlive-texdoc"

inherit rpm
