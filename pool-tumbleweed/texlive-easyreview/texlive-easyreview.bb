SUMMARY = "Package to provide a way to review (or perform editorial process) in LaTeX"
DESCRIPTION = "The easyReview package provides a way to review (or perform \
editorial process) in LaTeX. You can use the provided commands \
to claim attention in different ways to part of the text, or \
even to indicate that a text was added, needs to be removed, \
needs to be replaced and add comments to the text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn38352"

RPM_NAME = "texlive-easyreview-2026.226.1.0svn38352-61.4.noarch.rpm"
RPM_HASH = "660ee315a9456aa0690e35142b698b6abf57cf9b13c9312be7505bde8dd2c0764364fd77037e4cdafed3e7066fe58d1b03acbdced9457a24602f2c44f5ced004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyReview.sty \
texlive-easyreview"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
tex-todonotes.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
