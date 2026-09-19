SUMMARY = "English version of the wrapstuff package documentation"
DESCRIPTION = "This package provides an English translation of the \
documentation for the wrapstuff package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn71835"

RPM_NAME = "texlive-wrapstuff-doc-en-2026.226.0.0.3svn71835-59.4.noarch.rpm"
RPM_HASH = "53756c1f96debd8d18fb8a5d5365a14299b8a003760f5d1c20d19669fef6498efc019f15593550854a5bc6921d92431973532c74238c1a4131c720e41e14d392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapstuff-doc-en"

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
