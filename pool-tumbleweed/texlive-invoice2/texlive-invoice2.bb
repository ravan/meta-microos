SUMMARY = "Intelligent invoices with LaTeX3"
DESCRIPTION = "Typeset invoices with automatic VAT and calculation of totals. \
Supports internationalization, invoices are typeset with \
booktabs for readability. Does not support separate projects \
per invoice. Can be used as a replacement for invoice in most \
cases."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn67327"

RPM_NAME = "texlive-invoice2-2026.226.svn67327-60.2.noarch.rpm"
RPM_HASH = "d63654d75f0e889353ac08a95f852526230d5655bf51a62c614b59b4917e3e63f09780606889da7b1dff884a7cabe829aab772f9aca8baa1770aea9910023391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-invoice2.sty \
texlive-invoice2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-translations.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-booktabs \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin \
texlive-siunitx \
texlive-tools \
texlive-translations \
texlive-xcolor"

inherit rpm
