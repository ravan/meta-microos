SUMMARY = "LaTeX macros for using Silvio Levy's Greek fonts"
DESCRIPTION = "A conversion of Silvio Levy's Plain TeX macros for use with \
LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn21818"

RPM_NAME = "texlive-lgreek-2026.226.svn21818-61.2.noarch.rpm"
RPM_HASH = "b005d7fc84c1afe6af72eab0d2039b798f71aaaafbca3303d12bf06df062c82221dfa17cc33c38cebb0341e39557e0c02a892123f0b37fc8ac00d07d5048dec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGcmr.fd \
tex-LGcmtt.fd \
tex-LGenc.def \
tex-lgreek.sty \
texlive-lgreek"

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
