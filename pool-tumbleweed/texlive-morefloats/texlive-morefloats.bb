SUMMARY = "Increase the number of simultaneous LaTeX floats"
DESCRIPTION = "LaTeX can, by default, only cope with 18 outstanding floats; \
any more, and you get the error 'too many unprocessed floats'. \
This package releases the limit; TeX itself imposes limits \
(which are independent of the help offered by e-TeX). However, \
if your floats can't be placed anywhere, extending the number \
of floats merely delays the arrival of the inevitable error \
message."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-morefloats-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "c529f04ebe4a4e8b58520d29a7f41bd769177110c73fad54bb15f25d2a2655e3ff7d74c5bdc98f375b2104fcd37553795a7e2a9c4c81b95cc406c4954be81ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morefloats.sty \
texlive-morefloats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifetex.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
