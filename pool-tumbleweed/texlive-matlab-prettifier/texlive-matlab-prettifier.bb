SUMMARY = "Pretty-print Matlab source code"
DESCRIPTION = "The package extends the facilities of the listings package, to \
pretty-print Matlab and Octave source code. (Note that support \
of Octave syntax is not complete.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn34323"

RPM_NAME = "texlive-matlab-prettifier-2026.226.0.0.3svn34323-59.2.noarch.rpm"
RPM_HASH = "be0f0e2fa183470253317e0cd753c97e0d2505999ba70c85b7820ddcf9e588e71a1775a72e255ae5d1aca91a60fa52d78398915e0ff4722c53b4dc4a79f25257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matlab-prettifier.sty \
texlive-matlab-prettifier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
