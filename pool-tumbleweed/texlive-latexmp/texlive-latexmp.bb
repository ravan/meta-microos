SUMMARY = "Interface for LaTeX-based typesetting in MetaPost"
DESCRIPTION = "The MetaPost package latexMP implements a user-friendly \
interface to access LaTeX-based typesetting capabilities in \
MetaPost. The text to be typeset is given as string. This \
allows even dynamic text elements, for example counters, to be \
used in labels. Compared to other implementations it is much \
more flexible, since it can be used as direct replacement for \
btex.etex, and much faster, compared for example to the \
solution provided by tex.mp."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2.1svn55643"

RPM_NAME = "texlive-latexmp-2026.226.1.2.1svn55643-61.2.noarch.rpm"
RPM_HASH = "9fcb0154bcb2f7cdd64f25da77f17368304207a46401463b57e774b78788f9f5eb9781626a9b618b80527d0e5ffccb7b1801525fd0b0d421f1f7b8da7ec71420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexmp"

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
