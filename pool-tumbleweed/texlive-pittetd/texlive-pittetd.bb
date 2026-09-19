SUMMARY = "Electronic Theses and Dissertations at Pitt"
DESCRIPTION = "A document class for theses and dissertations. Provides patch \
files that enable pittetd to use files prepared for use with \
the pittdiss or pitthesis classes. The manual provides a \
detailed guide for users who wish to use the class to prepare \
their thesis or dissertation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.618svn15878"

RPM_NAME = "texlive-pittetd-2026.226.1.618svn15878-58.2.noarch.rpm"
RPM_HASH = "4e36eec19d0168bfd72a887ea15ca292cd115cb9929e4cad40ab9335bf84b103895491ecf62211435f714822710b14ac4a5ade170dee2eac04c432cfbe965099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pitetd10.clo \
tex-pitetd11.clo \
tex-pitetd12.clo \
tex-pittetd.cls \
texlive-pittetd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
