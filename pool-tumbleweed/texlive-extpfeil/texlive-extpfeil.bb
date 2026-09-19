SUMMARY = "Extensible arrows in mathematics"
DESCRIPTION = "The package provides some more extensible arrows (usable in the \
same way as \\xleftarrow from amsmath), and a simple command to \
create new ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-extpfeil-2026.226.0.0.4svn77682-59.2.noarch.rpm"
RPM_HASH = "f6a32209c60a4439dd799eca9de39cd2751d292cd08382a5d4c8481ceb599db7171d44b10cf7650e16edf1933d42477ef5b74cbdb826b13c41364acf8ffbf4d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extpfeil.sty \
texlive-extpfeil"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-mathtools.sty \
tex-stmaryrd.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
