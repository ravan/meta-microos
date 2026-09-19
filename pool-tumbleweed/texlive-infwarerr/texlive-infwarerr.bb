SUMMARY = "Complete set of information/warning/error message macros"
DESCRIPTION = "This package provides a complete set of macros for information, \
warning and error messages. Under LaTeX, the commands are \
wrappers for the corresponding LaTeX commands; under Plain TeX \
they are available as complete implementations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-infwarerr-2026.226.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "5e76d9b326860971ad256f5a201f1f67c470fdef1a8ec2d36a65ecd4e8323ac949e599297adbbc154815ed97e604c605572ebdb989869b7be053e55baf6d37b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infwarerr.sty \
texlive-infwarerr"

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
