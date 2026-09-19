SUMMARY = "Use different Greek letter fonts in math mode"
DESCRIPTION = "The purpose of this package is to provide access to numerous \
Greek letter fonts for math mode, without altering other \
mathematical characters and symbols and without loading whole \
extensions that provide these fonts. Moreover, the chosen font \
or shape can be changed dynamically throughout the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn71248"

RPM_NAME = "texlive-mathgreeks-2026.226.1.2svn71248-59.2.noarch.rpm"
RPM_HASH = "dca78e3415ed0aefe42088b0b76936351d4a0a3c4a4e6749e7bc2bc8252149f1eaed55492fc873492e79f935d17091a348942b540cb65b3ae9147730caab46ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathgreeks.sty \
texlive-mathgreeks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
