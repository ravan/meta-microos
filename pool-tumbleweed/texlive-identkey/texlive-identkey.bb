SUMMARY = "Typesetting bracketed dichotomous identification keys"
DESCRIPTION = "The package is for typesetting bracketed dichotomous \
identification keys."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-2026.226.0.0.1.0svn61719-60.2.noarch.rpm"
RPM_HASH = "cc51a87dfc84d04d8d290cd03f8ef1def67fe6e4541a336ce5d2dd8beb4e7ab5c8e7d679bc5a24051002694cd0d035368e14da8f8c540fb385f22c9774036197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-identkey.sty \
texlive-identkey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
