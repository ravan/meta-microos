SUMMARY = "Babel support for Romanian"
DESCRIPTION = "The package provides the language definition file for support \
of Romanian in babel. Translations to Romanian of standard \
'LaTeX names' are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2msvn77682"

RPM_NAME = "texlive-babel-romanian-2026.226.1.2msvn77682-60.2.noarch.rpm"
RPM_HASH = "e6d2aa0c2ebc41d336f7cafac41e7d3e298ad3405bd9595e61886d5f400d4ea45d01cc3ea59f2d2153610c56ee7a3e35b0c0709b1fa6db2b5d54de192ce06df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanian.ldf \
texlive-babel-romanian"

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
