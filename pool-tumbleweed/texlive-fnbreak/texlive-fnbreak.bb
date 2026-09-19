SUMMARY = "Warn for split footnotes"
DESCRIPTION = "This package detects footnotes that are split over several \
pages, and writes a warning to the log file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.40svn77682"

RPM_NAME = "texlive-fnbreak-2026.226.1.40svn77682-60.2.noarch.rpm"
RPM_HASH = "3059bc56f71c8af0bf9c14faec0a7cb14f43e3c9911f61980efb8d997f61e8eab78fe7a2344cbc061b6c813f290701bbef950d6a6d1907c44aa9244dc8818690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnbreak.sty \
texlive-fnbreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
