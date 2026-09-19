SUMMARY = "German translation of csquotes documentation"
DESCRIPTION = "This is a translation of the documentation of csquotes version \
5.1."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn23371"

RPM_NAME = "texlive-csquotes-de-2026.226.1.01svn23371-61.2.noarch.rpm"
RPM_HASH = "9ba6b7aabd1ed238be8bb10de53de6f6215d7bed374ad5c12bf7a84f955311048da8992167f5ddd820af00971fd920ad9093b8e4908b98936c644c0ee973fb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csquotes-de"

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
