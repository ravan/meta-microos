SUMMARY = "The LaTeX2e File Name Keeper"
DESCRIPTION = "This package 'looks over your shoulder' and keeps track of \
files \\input'ed (the LaTeX way) or \\include'ed in your \
document. You then have permanent access to the name of the \
file currently being processed through the macro \\finkfile. \
FiNK also comes with support for AUC-TeX. As of version 2.2.1, \
FiNK has been deprecated and is not maintained anymore. People \
interested in FiNK's functionality are invited to use a package \
named currfile instead."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn24329"

RPM_NAME = "texlive-fink-2026.226.2.2.1svn24329-59.2.noarch.rpm"
RPM_HASH = "ceb78a7779b471be3d306f4327ae05f9e639e2d97a65a75b494314c5a2a9157fb3dd704b3979fa4a56387e8b2cc444c56f4c1cd9ebea57b5bf427d1cb45420ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fink.sty \
texlive-fink"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
