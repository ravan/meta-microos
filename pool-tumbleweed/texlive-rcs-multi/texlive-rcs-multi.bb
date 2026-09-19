SUMMARY = "Typeset RCS version control in multiple-file documents"
DESCRIPTION = "The package enables the user to typeset version control \
information provided by RCS keywords (e.g., $ID: ... $) in \
LaTeX documents that contain multiple TeX files. The package is \
based on the author's svn-multi package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-2026.226.0.0.1asvn64967-60.4.noarch.rpm"
RPM_HASH = "ee3f298c20d8d6e15a5c5b5fe0dbca182ecd34f320257576f954917dfc45ef941bfc058908fef2961a7595f766bcd450e8ec931d2f6828363d02a93200d6b11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rcs-multi.sty \
texlive-rcs-multi"

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
