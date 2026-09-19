SUMMARY = "Class for typesetting letters to Swiss rules"
DESCRIPTION = "The class enables composition of letters fitting into Swiss C5 \
& C6/5 windowed envelopes. No assumption is made about the \
language used. The class is based on the standard LaTeX classes \
and is compatible with the LaTeX letter class. It is not \
limited to letters and may be used as a generic document class; \
it is used with the chextras package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn20060"

RPM_NAME = "texlive-chletter-2026.226.2.0svn20060-60.2.noarch.rpm"
RPM_HASH = "4fbf3842f00ef3c27c3e317c98fa7161ea4049a5ec9dad7359f3786ec5d8ecaa489a3080d8ed94d3bcc62acdcf67dfc9ced1c431beecb0c464e63dfd8a5db639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chletter.cls \
texlive-chletter"

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
