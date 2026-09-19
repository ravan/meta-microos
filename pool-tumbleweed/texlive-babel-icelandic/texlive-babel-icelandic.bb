SUMMARY = "Babel support for Icelandic"
DESCRIPTION = "The package provides the language definition file for support \
of Icelandic in babel. Some shortcuts are defined, as well as \
translations to Icelandic of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn51551"

RPM_NAME = "texlive-babel-icelandic-2026.226.1.3svn51551-60.2.noarch.rpm"
RPM_HASH = "d37deb84d847c3fc6308cc35c3f6bc0e649d2e8e71b97f235907afec61295384e161a87d581601fe695c35dee1e47dc1a0b9080de5bbcb58b6aa50c9058597a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icelandic.ldf \
texlive-babel-icelandic"

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
