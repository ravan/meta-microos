SUMMARY = "A LaTeX document style to produce homework, quiz and exam papers"
DESCRIPTION = "The package provides commands and environments that simplify \
and streamline the process of preparing homework, quiz and exam \
papers according to apreffered style. The default style is \
based on the guidelines set by the department of mathematics at \
King Fahd University of Petroleum and Minerals (KFUPM). It can \
be easily customized to fit any style for any institution."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn63977"

RPM_NAME = "texlive-kfupm-math-exam-2026.226.0.0.1.0svn63977-63.2.noarch.rpm"
RPM_HASH = "86ff8c80822b058921531865dcba2422a9d0720d505e87559892d9a9e50a8ff17a983e3098ed07f3704b5316e6b8b1ebe2013cc7db5695fb9af4779d56f25aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kfupm-math-exam.cls \
texlive-kfupm-math-exam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-article.cls \
tex-booktabs.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-mathrsfs.sty \
tex-pgfplots.sty \
tex-tcolorbox.sty \
tex-trimspaces.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
