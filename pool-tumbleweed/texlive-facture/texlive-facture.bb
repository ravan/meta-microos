SUMMARY = "Generate an invoice"
DESCRIPTION = "Une classe simple permettant de produire une facture, avec ou \
sans TVA, avec gestion d'une adresse differente pour la \
livraison et pour la facturation. A simple class that allows \
production of an invoice, with or without VAT; different \
addresses for delivery and for billing are permitted."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn67538"

RPM_NAME = "texlive-facture-2026.226.1.3svn67538-59.2.noarch.rpm"
RPM_HASH = "535e7450069cfb89c92639882fb5a1e2f6a4637022bbb687902d29ae7a14af70d7d5bf5a0032b114aaca6d7ec7aef819c0a453a77e25e06f1bcd0cf8b4b8f2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-facture.cls \
texlive-facture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-advdate.sty \
tex-array.sty \
tex-article.cls \
tex-colortbl.sty \
tex-fancyhdr.sty \
tex-fltpoint.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-numprint.sty \
tex-polyglossia.sty \
tex-tikz.sty \
tex-xargs.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
