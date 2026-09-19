SUMMARY = "A LaTeX class for bank statements based on csv data"
DESCRIPTION = "More and more banks allow their customers to download posting \
records in various formats. By using the bankstatement class, \
you can create bank statements, as long as a csv format is \
available. At the moment, the csv-mt940 and csv-camt formats -- \
used by many german Sparkassen -- are supported. You can quite \
easily add support for other csv formats. Simply define the \
order of the keys in the csv data file and how to use them. The \
terminology in this class -- such as BIC (Business Identifier \
Code) or IBAN (International Bank Account Number) -- is based \
on usage in the SEPA (Single Euro Payments Area). The user may \
adjust the terminology to suit local needs."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.2svn75301"

RPM_NAME = "texlive-bankstatement-2026.226.0.0.9.2svn75301-60.2.noarch.rpm"
RPM_HASH = "4af61b30c266c9a6843e5652268e6e08cddc585e75166ae42bb1a04d8ff63442eea6387e402e04d0497fd0022f735e65a06c083732889a35be58ff8e95faa20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bankstatement.cls \
tex-csv-camt.def \
tex-csv-mt940.def \
tex-csv-standard-bank-na.def \
tex-stmenglish.def \
tex-stmgerman.def \
tex-stmnamibian.def \
texlive-bankstatement"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-datatool.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xkvltxp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
