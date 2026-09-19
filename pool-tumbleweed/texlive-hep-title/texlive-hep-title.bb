SUMMARY = "Extensions for the title page"
DESCRIPTION = "The hep-title package extends the title macros of the standard \
classes with macros for a preprint, affiliation, editors, and \
endorsers. The package is loaded with \\usepackage{hep-title}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-title-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "9d9d29f152c0cf8ccb061e0eab2205046f2ba4c61f0c9da374f3ef88075a6bd643a1e3b4a835502cc68753f438dc2e0753cf6db14b8c30ccb6590774d399204d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-title.sty \
texlive-hep-title"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abstract.sty \
tex-atbegshi.sty \
tex-authblk.sty \
tex-calc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-picture.sty \
tex-titling.sty \
tex-varwidth.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
