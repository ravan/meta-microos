SUMMARY = "Typeset Subversion keywords"
DESCRIPTION = "The svn package lets you typeset (in LaTeX) the value of \
Subversion keywords. It is approximately an equivalent to the \
rcs package, but for Subversion rather than CVS. Details of \
Subversion (a replacement for CVS) is available from the \
project's home site."
LICENSE = "LPPL-1.0"

PV = "2026.226.43svn15878"

RPM_NAME = "texlive-svn-2026.226.43svn15878-64.2.noarch.rpm"
RPM_HASH = "d38934a2f16f8a0ff0c92e189ec43298e0f653e0c31622d3ce2b95f284ea82444d80e7b68a831acdd214460192dc0db635ac10d4bc0f6b83829b8427606deecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn.sty \
texlive-svn"

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
