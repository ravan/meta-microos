SUMMARY = "Session and timing information in lecture notes"
DESCRIPTION = "This LaTeX2e package makes it possible to add timing marks to \
lecture notes in order to help managing the time available for \
presenting a given section of the document. It also provides \
tools to record and estimate the progress throughout the \
course."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.3svn74748"

RPM_NAME = "texlive-sesstime-2026.226.1.1.3svn74748-60.2.noarch.rpm"
RPM_HASH = "09578249543a41da3782a345202a4a62bcd2ce1d958311f7fec099c14494b66281382952b3c91e169105dde74f2cb141c35915fc634487f905c7c149a972e0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sesstime.sty \
texlive-sesstime"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
