SUMMARY = "Thesis class for George Washington University School of Engineering and Applied Science"
DESCRIPTION = "This class is an attempt to create a standard format for GWU \
SEAS dissertations/theses. It automatically handles many of the \
complicated formatting requirements and includes many useful \
packages. An example thesis is provided serving as a user guide \
and a demonstration of the thesis."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.7.0svn54287"

RPM_NAME = "texlive-thesis-gwu-2026.227.1.7.0svn54287-62.2.noarch.rpm"
RPM_HASH = "a19187b7bd2ca429c30a3a854976f1e429c02fa9bf43c647f936b373f7f0a81d0983c9d2ba8e368d25044e58a8720006aff329aa48b2d6423eadfc6482c67d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thesis-gwu.cls \
texlive-thesis-gwu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
