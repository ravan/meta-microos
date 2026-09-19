SUMMARY = "Provides unlimited unique counter"
DESCRIPTION = "This package provides a kind of counter that provides unique \
number values. Several counters can be created with different \
names. The numeric values are not limited."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-uniquecounter-2026.226.1.4svn77682-60.2.noarch.rpm"
RPM_HASH = "fafe829b96509a1b0e61716a6230e3d7fe33dbe64a4c153d8711ba251bf5246aa1954ea1f889c6c0a78a5e778dc16f50c95515c37729b7ae056d77ae2a231fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uniquecounter.sty \
texlive-uniquecounter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bigintcalc.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
