SUMMARY = "OpenType Math font support for LuaLaTeX"
DESCRIPTION = "A faster and more compatible package to support using OpenType \
math fonts in LuaLaTeX as an alternative for unicode-math."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-lua-unicode-math-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "d5da1621231be208328071e5bb4cbfdc9214bc6a64fe6ef59dd7ff45aab21ee14753a0ba9d7197dd32b29f8300876eb5910089898179cf38ca7271d292272427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-unicode-math.sty \
tex-lum-bonum.sty \
tex-lum-concrete.sty \
tex-lum-dejavu.sty \
tex-lum-erewhon.sty \
tex-lum-fira.sty \
tex-lum-gfsneohellenic.sty \
tex-lum-lmodern.sty \
tex-lum-newcomputermodern.sty \
tex-lum-newcomputermodernsans.sty \
tex-lum-pagella.sty \
tex-lum-schola.sty \
tex-lum-stix2.sty \
tex-lum-termes.sty \
tex-lum-xcharter.sty \
tex-lum-xits.sty \
tex-tuconcmath-sf.fd \
tex-tuconcmath-ssf.fd \
tex-tuconcmath.fd \
tex-tuerewhon-math-sf.fd \
tex-tuerewhon-math-ssf.fd \
tex-tuerewhon-math.fd \
tex-tufira-math-sf.fd \
tex-tufira-math-ssf.fd \
tex-tufira-math.fd \
tex-tugfsneohellenic-math-sf.fd \
tex-tugfsneohellenic-math-ssf.fd \
tex-tugfsneohellenic-math.fd \
tex-tulmm-sf.fd \
tex-tulmm-ssf.fd \
tex-tulmm.fd \
tex-tuncmm-sf.fd \
tex-tuncmm-ssf.fd \
tex-tuncmm.fd \
tex-tuncmsm-sf.fd \
tex-tuncmsm-ssf.fd \
tex-tuncmsm.fd \
tex-tustix2-math-sf.fd \
tex-tustix2-math-ssf.fd \
tex-tustix2-math.fd \
tex-tutg-bonum-math-sf.fd \
tex-tutg-bonum-math-ssf.fd \
tex-tutg-bonum-math.fd \
tex-tutg-dejavu-math-sf.fd \
tex-tutg-dejavu-math-ssf.fd \
tex-tutg-dejavu-math.fd \
tex-tutg-pagella-math-sf.fd \
tex-tutg-pagella-math-ssf.fd \
tex-tutg-pagella-math.fd \
tex-tutg-schola-math-sf.fd \
tex-tutg-schola-math-ssf.fd \
tex-tutg-schola-math.fd \
tex-tutg-termes-math-sf.fd \
tex-tutg-termes-math-ssf.fd \
tex-tutg-termes-math.fd \
tex-tuxcharter-math-sf.fd \
tex-tuxcharter-math-ssf.fd \
tex-tuxcharter-math.fd \
tex-tuxits-math-sf.fd \
tex-tuxits-math-ssf.fd \
tex-tuxits-math.fd \
texlive-lua-unicode-math"

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
