SUMMARY = "Package to typeset SI units, numbers and angles"
DESCRIPTION = "This package typesets SI units, numbers and angles according to \
the ISO requirements. Care is taken with font setup and \
requirements, and language customisation is available. Note \
that this package is (in principle) superseded by siunitx; \
sistyle has maintenance-only support, now."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3asvn59682"

RPM_NAME = "texlive-sistyle-2026.226.2.3asvn59682-64.2.noarch.rpm"
RPM_HASH = "66604c1a22714caab89682d93701b063ddef2d035f0ad9ff4693ad49406d66c8d2cbaad85664af0ed6128e18ef0674c3a3a2810d1baff1432a509e00b03bc6e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sistyle.sty \
texlive-sistyle"

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
