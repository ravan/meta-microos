SUMMARY = "Statistics style"
DESCRIPTION = "A package defining many macros for items of significance in \
statistical presentations. An updated, but incompatible, \
version of the package is available: statex2."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn20306"

RPM_NAME = "texlive-statex-2026.226.1.6svn20306-64.2.noarch.rpm"
RPM_HASH = "cfe840859c4b3d9b765344210477f2b0a6b844508ba66700f12d0baf1850430a8fccfe8f48defc9d83c9b9c2cfbaba127ee762d0d88bb595790ca08f0ca02a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statex.sty \
texlive-statex"

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
