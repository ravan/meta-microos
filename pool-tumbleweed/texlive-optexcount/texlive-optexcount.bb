SUMMARY = "Python script for counting words in OpTeX documents"
DESCRIPTION = "OpTeXcount is a basic python utility that analyzes OpTeX source \
code. It is inspired by already existing TeXcount for LaTeX. \
The functionality is really lightweight and basic. It counts \
words and other elements of OpTeX document and sorts them out \
into individual categories. Users can print the source code \
with highlighted words using several colors,so they see what is \
considered as word, header etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn59817"

RPM_NAME = "texlive-optexcount-2026.226.1.1svn59817-61.2.noarch.rpm"
RPM_HASH = "14a646a8060271cd3e60100bdf29bd3da2adc5aedbe586c1d95f1076c834fe3e6f3a352e186a77dd2a62074f831e9fdb914cba1ad5f2598c0b6864ec82f46b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optexcount"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-optexcount-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
