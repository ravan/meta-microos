SUMMARY = "E-TeX support package"
DESCRIPTION = "The package provides support for LaTeX documents to use many of \
the extensions offered by e-TeX; in particular, it modifies \
LaTeX's register allocation macros to make use of the extended \
register range. The etextools package provides macros that make \
more sophisticated use of e-TeX's facilities."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-etex-pkg-2026.226.2.7svn77682-59.2.noarch.rpm"
RPM_HASH = "255275b8503ab305f56a48d2bacf87e855f87aaddf73a380a4424413e6d0cddcf85cab17ed11f8f75b44b3b5d7906536c9ecf67c850940530c5acfa5210e3587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etex.sty \
texlive-etex-pkg"

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
