SUMMARY = "Chinese dummy text"
DESCRIPTION = "This package provides an interface to dummy text in Chinese \
language, which will be useful for testing Chinese documents. \
UTF-8, GBK and Big5 encodings are supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-2026.226.1.2.0svn54994-59.4.noarch.rpm"
RPM_HASH = "c6d5c85220ddd6d8262a7aba422ceeccfafc0038d2b97317cfdddc94c2ca8258f9ac47da68d36bbd69d21a6cd7330dfcb53fcbb42478dfdcc300cd9840dd6809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhlipsum-big5.def \
tex-zhlipsum-gbk.def \
tex-zhlipsum-utf8.def \
tex-zhlipsum.sty \
texlive-zhlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
