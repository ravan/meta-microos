SUMMARY = "More flexible alignment in amsmath environments"
DESCRIPTION = "Allow aligning mathematical expressions on points where \
directly using & is not possible, especially in nested macros \
or environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-luamathalign-2026.226.0.0.3svn77682-59.2.noarch.rpm"
RPM_HASH = "2f41910d90d6bc59b72d3444f47549b02359979f9d2babed9b22acb841fa46d9fb3f45da8740bcea3fe4de834b380426ef28f09d2e2181f25d4ee39b48b9bdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamathalign.sty \
texlive-luamathalign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
