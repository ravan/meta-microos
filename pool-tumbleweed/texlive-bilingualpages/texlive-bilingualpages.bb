SUMMARY = "Typeset two columns in parallel"
DESCRIPTION = "This is a simple wrapper for the paracol package for setting \
two-column parallel text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn59643"

RPM_NAME = "texlive-bilingualpages-2026.226.1.0.0svn59643-61.2.noarch.rpm"
RPM_HASH = "b01f2b8e8d7af7b7d741c092e8a6c7f21f3f12d46d03f7ad8136ae221be25f89d299a7cd11ca41fa018b6c782eaa2cf08b8b7e29965b35427423ff6d210ce658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bilingualpages.sty \
texlive-bilingualpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paracol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
