SUMMARY = "TeTeX scheme (more than medium, but nowhere near full)"
DESCRIPTION = "TeX Live scheme nearly equivalent to the teTeX distribution \
that was maintained by Thomas Esser."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn74022"

RPM_NAME = "texlive-scheme-tetex-2026.222.svn74022-68.2.noarch.rpm"
RPM_HASH = "77e5ea76dd26ca252f6737bbd5d375cb51bb9e08e495cecc8ad482531c485a17504ddfd303182e38734e9d9c37516721e48f925f047ef0e688be9908a3ee00c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-tetex \
texlive-scheme-tetex"

RDEPENDS:${PN} += "texlive-acronym \
texlive-amslatex-primer \
texlive-bbm \
texlive-bbm-macros \
texlive-bbold \
texlive-bibtex8 \
texlive-cmbright \
texlive-collection-basic \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-formatsextra \
texlive-collection-langcjk \
texlive-collection-langcyrillic \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langgreek \
texlive-collection-langitalian \
texlive-collection-langother \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-pictures \
texlive-collection-plaingeneric \
texlive-collection-pstricks \
texlive-ctie \
texlive-cweb \
texlive-detex \
texlive-dtl \
texlive-dvicopy \
texlive-dvidvi \
texlive-dviljk \
texlive-eplain \
texlive-eulervm \
texlive-gentle \
texlive-lshort-english \
texlive-mltex \
texlive-multirow \
texlive-nomencl \
texlive-patgen \
texlive-pst-pdf \
texlive-rsfs \
texlive-seetexk \
texlive-siunits \
texlive-subfigure \
texlive-supertabular \
texlive-tamethebeast \
texlive-tds \
texlive-tie \
texlive-web \
texlive-xpdfopen"

inherit rpm
