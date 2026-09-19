SUMMARY = "Babel support for Czech"
DESCRIPTION = "The package provides the language definition file for support \
of Czech in babel. Some shortcuts are defined, as well as \
translations to Czech of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1asvn30261"

RPM_NAME = "texlive-babel-czech-2026.226.3.1asvn30261-60.2.noarch.rpm"
RPM_HASH = "ebf3ae8def2c48619693de4a5c5445d36e1ade2f63d469ded1cd5963c6dc7abcb5106ec531f18b61995750bebeed6e948f1e7497d139ec61110f520e327bcc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-czech.ldf \
texlive-babel-czech"

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
