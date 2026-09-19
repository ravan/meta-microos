SUMMARY = "Automatically compute headlength for fancyhdr package"
DESCRIPTION = "The package automatically computes headlength for the fancyhdr \
package"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn54049"

RPM_NAME = "texlive-autofancyhdr-2026.226.0.0.1svn54049-60.2.noarch.rpm"
RPM_HASH = "54ece14b7bfcc497e093408da49d1da560a0343e8a366188293b6ef034d513393e9085d2965e8ab17fcc3151ea21f64e68c9a29cde7ed3c198a39b59a5b34b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autofancyhdr.sty \
texlive-autofancyhdr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-fancyhdr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
