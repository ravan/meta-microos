SUMMARY = "Babel contributed support for Breton"
DESCRIPTION = "Breton (being, principally, a spoken language) does not have \
typographic rules of its own; this package provides an \
'appropriate' selection of French and British typographic \
rules."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0isvn77470"

RPM_NAME = "texlive-babel-breton-2026.226.1.0isvn77470-60.2.noarch.rpm"
RPM_HASH = "d8966c7fabc29796dd17cc3cf5ef80ce44e90c18270c5bf7853fc4e78e885bdd38a41d14572182261da0dcc5790ee60efa057a30ae892c807bea7321571686e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breton.ldf \
texlive-babel-breton"

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
