SUMMARY = "Recommended fonts"
DESCRIPTION = "Recommended fonts, including the base 35 PostScript fonts, \
Latin Modern, TeX Gyre, and T1 and other encoding support for \
Computer Modern, in outline form."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54074"

RPM_NAME = "texlive-collection-fontsrecommended-2026.222.svn54074-68.2.noarch.rpm"
RPM_HASH = "b2c97c14cb353f0a2ef2b70cf06e93f889e070056fe32bf81d8eb8450d1f92419ee3f8c438b2c7a8526740f55b7efbebd439a84ab6787396dff231e90502cd1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-fontsrecommended \
texlive-collection-fontsrecommended"

RDEPENDS:${PN} += "texlive-avantgar \
texlive-bookman \
texlive-charter \
texlive-cm-super \
texlive-cmextra \
texlive-collection-basic \
texlive-courier \
texlive-euro \
texlive-euro-ce \
texlive-eurosym \
texlive-fpl \
texlive-helvetic \
texlive-lm \
texlive-lm-math \
texlive-manfnt-font \
texlive-marvosym \
texlive-mathpazo \
texlive-mflogo-font \
texlive-ncntrsbk \
texlive-palatino \
texlive-pxfonts \
texlive-rsfs \
texlive-symbol \
texlive-tex-gyre \
texlive-tex-gyre-math \
texlive-times \
texlive-tipa \
texlive-txfonts \
texlive-utopia \
texlive-wasy \
texlive-wasy-type1 \
texlive-wasysym \
texlive-zapfchan \
texlive-zapfding"

inherit rpm
