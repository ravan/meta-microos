SUMMARY = "Statistics style"
DESCRIPTION = "The package defines many macros for items of significance in \
statistical presentations. It represents a syntax-incompatible \
upgrade of statex."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn23961"

RPM_NAME = "texlive-statex2-2026.226.2.1svn23961-64.2.noarch.rpm"
RPM_HASH = "4a5a8e876857d304814b26a42dc304e23e510e430dc25fed1498e37ccf5c8dc5c4cd27d8aa4981e2970bdb40121c8a2e2855bafc63f47e46168d75e6f5bebd2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statex2.sty \
texlive-statex2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-color.sty \
tex-ifthen.sty \
tex-shortvrb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
