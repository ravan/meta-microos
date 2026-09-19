SUMMARY = "Control rendering parameters"
DESCRIPTION = "The package provides interfaces for the user to control PDF \
parameters, such as line width or text rendering mode. The \
control operations work in a manner very similar to that of the \
color package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-pdfrender-2026.226.1.8svn77682-58.2.noarch.rpm"
RPM_HASH = "055c6ea0a7d5b50098b6b98e95be9077e3ebef598de4562108a86a28d3dc2eb9701a80610d4916c2802600e45c9c889f145b60a53b9566a458cafff67e17d063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfrender.sty \
texlive-pdfrender"

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
