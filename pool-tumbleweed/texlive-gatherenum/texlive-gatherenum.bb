SUMMARY = "A crossover of align* and enumerate"
DESCRIPTION = "This package (ab)uses the inline enumeration capabilities of \
enumitem to add a 'displayed' enumeration mode, triggered by \
adding 'gathered' to the key-value option list of the enumerate \
environment. The end result is similar to a regular enumerate \
environment wrapped in a multicols environment, with the \
following advantages: Gathered enumerate can pack items \
depending on their actual width rather than a fixed, constant \
number per line. Gathered enumeration fills items in a \
line-major order (instead of column-major order), which my \
students found less confusing. YMMV. The package depends on \
enumitem, expl3, and xparse,"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.8svn76924"

RPM_NAME = "texlive-gatherenum-2026.226.1.8svn76924-60.2.noarch.rpm"
RPM_HASH = "590219fdf0744dbb7a09d1db0ef435f26f3dbfed20a499f2026ee7d07435bfc1a1d08f457d46c8adde9386205eca60960c839fdc5ceec89b6c54df699733ffda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gatherenum.sty \
texlive-gatherenum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
