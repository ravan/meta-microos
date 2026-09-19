SUMMARY = "Manipulate COntent Oriented LaTeX Lists"
DESCRIPTION = "Lists are defined as a sequence of tokens separated by a comma. \
The coollist package allows the user to access certain elements \
of the list while neglecting others--essentially turning lists \
into a sort of array. List elements are accessed by specifying \
the position of the object within the list (the index of the \
item)."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.4svn67048"

RPM_NAME = "texlive-coollist-2026.226.1.4svn67048-61.2.noarch.rpm"
RPM_HASH = "0f61b2828ca0fe8c2002963d1f2040883d0da4db64f6f3e2677f3162f3288dac178c6b43c3b21de57f1d89c257cd7c86c94427cabdc941b41070353011999020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coollist.sty \
texlive-coollist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-coolstr.sty \
tex-forloop.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
