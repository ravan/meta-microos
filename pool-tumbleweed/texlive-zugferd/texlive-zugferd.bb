SUMMARY = "ZUGFeRD and Faktur-X invoicing using LaTeX"
DESCRIPTION = "This package provides interfaces to allow creating ZUGFeRD or \
Faktur-X invoices with LaTeX including the XML file. It can be \
used to modify personal invoicing templates to fulfil the \
requirements for digital invoicing without further modification \
of the invoicing processes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn76924"

RPM_NAME = "texlive-zugferd-2026.226.0.0.10svn76924-59.4.noarch.rpm"
RPM_HASH = "2585e1fd764dd9ec4520acd319928c59c31884c69e0908e0a2eb1747330e8a34ccb353a02b8ff062379d708a599a0e004dbaf2a4432ff4c65f15c771e4e25a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zugferd-invoice.sty \
tex-zugferd.sty \
texlive-zugferd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-booktabs.sty \
tex-ragged2e.sty \
tex-scrletter.sty \
tex-siunitx.sty \
tex-xltabular.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-siunitx"

inherit rpm
