SUMMARY = "Babel support for Scottish Gaelic"
DESCRIPTION = "The package provides the language definition file for support \
of Gaidhlig (Scottish Gaelic) in babel. Some shortcuts are \
defined, as well as translations of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0hsvn77682"

RPM_NAME = "texlive-babel-scottish-2026.226.1.0hsvn77682-60.2.noarch.rpm"
RPM_HASH = "181277737b965c5b9473c723dbef6b41aa3cb87e1e64d5cd9210170653caa0d80679afc16fe4f8f2ec9a26afbc3cdb18567942466eb405da0f41a4d64e01c452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scottish.ldf \
tex-scottishgaelic.ldf \
texlive-babel-scottish"

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
