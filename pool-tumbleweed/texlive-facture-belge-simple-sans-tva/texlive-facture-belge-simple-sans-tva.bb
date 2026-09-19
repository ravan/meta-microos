SUMMARY = "Simple Belgian invoice without VAT"
DESCRIPTION = "This package can be used to generate invoices for Belgian \
individuals who do not have a VAT number and who wish to do \
occasional work, or to carry out paid additional activities \
during their free time up to 6,000 euros per calendar year \
(amount indexed annually) without having to pay tax or social \
security contributions (see the website Activites \
complementaires). The package can also generate expense \
reports. All totals are calculated automatically, in the \
invoice and in the expense report. The package depends on \
calctab, ifthen, hyperref, fancyhdr, multirow, eurosym, color, \
and colortbl."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn67573"

RPM_NAME = "texlive-facture-belge-simple-sans-tva-2026.226.2.1svn67573-59.2.noarch.rpm"
RPM_HASH = "c2c67e992adc11cf4d168d8df60a89b34de15df54f00504220ac29d441393053fadc2ea7a990b5fda729e0402b3cef2f48051a01eedae9bdd7d6dffabe5d29da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-facture-belge-simple-sans-tva.sty \
texlive-facture-belge-simple-sans-tva"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
