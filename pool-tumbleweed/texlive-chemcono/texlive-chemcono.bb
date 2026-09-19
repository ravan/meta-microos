SUMMARY = "Support for compound numbers in chemistry documents"
DESCRIPTION = "A LaTeX package for using compound numbers in chemistry \
documents. It works like \\cite and the \\thebibliography, using \
\\fcite and \\theffbibliography instead. It allows compound names \
in documents to be numbered and does not affect the normal \
citation routines."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn17119"

RPM_NAME = "texlive-chemcono-2026.226.1.3svn17119-60.2.noarch.rpm"
RPM_HASH = "8f6d49612bd992cbd48ee14d24afdd1a16fb4e9948c10688177dd529a5f9dcb140b451fc12f81f0a35ac935c0876d66ca003db842501ce875a894115b2b6fb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemcono.sty \
tex-drftcono.sty \
tex-showkeysff.sty \
texlive-chemcono"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
