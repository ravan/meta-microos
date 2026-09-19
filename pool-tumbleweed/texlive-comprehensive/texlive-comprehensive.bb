SUMMARY = "Symbols accessible from LaTeX"
DESCRIPTION = "Over 20000 symbols accessible from LaTeX are listed in a set of \
tables organized by topic and package. The aim is to make it \
easy to find symbols and learn how to incorporate them into a \
LaTeX document. An index further helps locate symbols of \
interest."
LICENSE = "LPPL-1.0"

PV = "2026.226.15.0svn69619"

RPM_NAME = "texlive-comprehensive-2026.226.15.0svn69619-60.2.noarch.rpm"
RPM_HASH = "73822b3ffaabb539bb61345c2a16c2cfe6795a5428df940cd6edc22fab15af4be21c5f83e5d2912543f8a0892681f29c004b47d07054cd0b9bd605a435963c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comprehensive"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3.13 \
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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
