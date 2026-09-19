SUMMARY = "Typeset bit pattern diagrams"
DESCRIPTION = "A package to typeset bit pattern diagrams such as those used to \
describe hardware, data format or protocols."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn39073"

RPM_NAME = "texlive-bitpattern-2026.226.svn39073-59.2.noarch.rpm"
RPM_HASH = "e3a5648ee65280d342bcc39bf33cad45993383ace609208a24cbf0ea527a1c777acadfabf5b14d393c415422379eb2e0eb99128381b8c32edcd4cfce98271cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitpattern.sty \
texlive-bitpattern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
tex-multido.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
