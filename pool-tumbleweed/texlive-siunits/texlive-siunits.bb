SUMMARY = "International System of Units"
DESCRIPTION = "Typeset physical units following the rules of the International \
System of Units (SI). The package requires amstext, for proper \
representation of some values. Note that the package is now \
superseded by siunitx; siunits has maintenance-only support, \
now."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.36svn59702"

RPM_NAME = "texlive-siunits-2026.226.1.36svn59702-64.2.noarch.rpm"
RPM_HASH = "a699555ff9c0c799c653593b82ddfa73c8ee011c0d7bafa768c203e08e1bb6b6040598f7d46bbc46d768359b6b621d9b3e1590c957d22729dcce3d0432b22c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SIunits.cfg \
tex-SIunits.sty \
tex-binary.sty \
texlive-siunits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
