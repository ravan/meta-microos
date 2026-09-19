SUMMARY = "Giving meaning to various Unicode space characters"
DESCRIPTION = "LaTeX package that gives meaning to various Unicode space \
characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.05svn63123"

RPM_NAME = "texlive-uspace-2026.226.0.0.05svn63123-60.2.noarch.rpm"
RPM_HASH = "9b6f7ee9d8e9365c8c4b38f771de56ef67eac15992d1ea9e074948bea3ff4d489848d454f09171674695da5a68cc31c2b9010a5e839a211e056933a4d873a80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uspace.sty \
texlive-uspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-newunicodechar.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
