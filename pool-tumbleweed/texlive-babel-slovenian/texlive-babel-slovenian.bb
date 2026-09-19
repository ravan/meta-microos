SUMMARY = "Babel support for typesetting Slovenian"
DESCRIPTION = "The package provides the language definition file for support \
of Slovenian in babel. Several shortcuts are defined, as well \
as translations to Slovenian of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2psvn77682"

RPM_NAME = "texlive-babel-slovenian-2026.226.1.2psvn77682-60.2.noarch.rpm"
RPM_HASH = "f89b0310f63ff4089f2ec0694cc365db0948792fc3256e5bfc900cdb7cd37cf7c22ecaec22e3c289242516e83e8d90296bbc3cc359944647bd28f28811142e3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slovene.ldf \
tex-slovenian.ldf \
texlive-babel-slovenian"

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
