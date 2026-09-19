SUMMARY = "Babel support for Polish"
DESCRIPTION = "The package provides the language definition file for support \
of Polish in babel. Some shortcuts are defined, as well as \
translations to Polish of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-babel-polish-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "2429ac2c68dfd0c9d6aa9e6603cd1da8733dda732dab0ba3fe6275c0a1624c0b3805437fb632cd99973aad7081801a1f68c28d1686968a44570e14e36d621b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polish-compat.ldf \
tex-polish.ldf \
texlive-babel-polish"

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
