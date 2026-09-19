SUMMARY = "Generate invoices"
DESCRIPTION = "The package may be used for generating invoices. The package \
can deal with invisible expense items and deductions; output \
may be presented in any of 10 different languages. A \
long-standing bug has been removed. Numbers now can show the \
comma as decimal separator. The package depends on the fp, calc \
and siunitx for its calculations."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48359"

RPM_NAME = "texlive-invoice-2026.226.svn48359-60.2.noarch.rpm"
RPM_HASH = "2313f8d688c2e42bfefee58d1db2b7e9f708787afd8e1fa47a456c764a509d0ef903154ece6a89a4577b3e73a579b4c2cece64ac044d47c3740d9d6564bed15a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-invoice.sty \
tex-invoicelabels.sty \
texlive-invoice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
