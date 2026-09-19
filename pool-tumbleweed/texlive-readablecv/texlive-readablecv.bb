SUMMARY = "A highly readable and good looking CV and letter class"
DESCRIPTION = "This class provides, what I have found, to be an extremely \
attractive and highly readable CV which will lead to your CV \
being read rather than disregarded."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn76790"

RPM_NAME = "texlive-readablecv-2026.226.4.0svn76790-60.4.noarch.rpm"
RPM_HASH = "b93195802ecfafeeee680db08bb4fc02ccc28261f07cf252d25e942b49fe9a786b2c7e4850cc1fc009865816badcd80e488c5c7464a680067e1786c940213c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ReadableCV.cls \
texlive-readablecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-marvosym.sty \
tex-memoir.cls \
tex-multicol.sty \
tex-roboto.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
