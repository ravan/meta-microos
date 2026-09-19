SUMMARY = "Declare global variables"
DESCRIPTION = "This package allows the user to declare a variable which can \
then be used anywhere else in a document, including before it \
was declared."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn49962"

RPM_NAME = "texlive-globalvals-2026.226.1.1svn49962-60.4.noarch.rpm"
RPM_HASH = "438dd4201a620d87b0a9804b894778b3a1891670b6f00614c330daa65b7fedb2f557d76bfe3db600c9138d9842ae1af3de10db55a74ac346bbe9e5d634e9fb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-globalvals.sty \
texlive-globalvals"

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
