SUMMARY = "The Plain TeX format"
DESCRIPTION = "Contains files used to build the Plain TeX format, as described \
in the TeXbook, together with various supporting files (some \
also discussed in the book)."
LICENSE = "SUSE-TeX"

PV = "2026.226.3.1415926535svn75712"

RPM_NAME = "texlive-plain-2026.226.3.1415926535svn75712-58.2.noarch.rpm"
RPM_HASH = "23305950ab1660726ad4d6e0654a3bc5c4a2534bbf55846a9b5e59e7e4fd2806ea965a6353fac39b5eb524a26f90ab18d35447077fc1c0b520ef0abfdb1c71aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontchart.tex \
tex-gkpmac.tex \
tex-letterformat.tex \
tex-list-latin.tex \
tex-list.tex \
tex-llist-latin.tex \
tex-llist.tex \
tex-mptmac.tex \
tex-pdftexmagfix.tex \
tex-picmac.tex \
tex-plain.tex \
tex-wlist.tex \
texlive-plain"

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
