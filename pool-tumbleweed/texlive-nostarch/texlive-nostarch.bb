SUMMARY = "LaTeX class for No Starch Press"
DESCRIPTION = "The package provides the 'official' LaTeX style for No Starch \
Press. Provided are a class, a package for interfacing to \
hyperref and an index style file. The style serves both for \
printed and for electronic books."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn67683"

RPM_NAME = "texlive-nostarch-2026.226.2.4svn67683-61.2.noarch.rpm"
RPM_HASH = "d7589af0c00d4131ec71584b8de95b71cfbacf00e2063ab659d9351cb7748b8ed5a24648bf2b4c129f9483dd85ce65f3f3046f8b50f8f1e9f4774f3e77916ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nostarch.cls \
tex-nshyper.sty \
texlive-nostarch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-fontenc.sty \
tex-fontspec.sty \
tex-mdframed.sty \
tex-ragged2e.sty \
tex-soul.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
