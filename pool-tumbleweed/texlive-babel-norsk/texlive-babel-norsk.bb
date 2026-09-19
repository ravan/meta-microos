SUMMARY = "Babel support for Norwegian"
DESCRIPTION = "The package provides the language definition file for support \
of Norwegian in babel. Some shortcuts are defined, as well as \
translations to Norsk of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0ksvn77682"

RPM_NAME = "texlive-babel-norsk-2026.226.2.0ksvn77682-60.2.noarch.rpm"
RPM_HASH = "eaba6bf7170b5dc34563e4028fc4bf0fdbea59ed02683e03a2f0f1e3de36a807a32203cdbca86f7288d988d083d3fbdca6d7c721a8e6756917bec8753bf74aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-norsk.ldf \
tex-norwegian.ldf \
tex-nynorsk.ldf \
texlive-babel-norsk"

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
