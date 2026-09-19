SUMMARY = "Captions on more than floats"
DESCRIPTION = "Defines a command \\captionof for putting a caption to something \
that's not a float. Note that the caption package includes a \
\\captionof command that is an extension of that provided by \
this package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-capt-of-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "d85af552532555e8f5a33cda0e08be351dd6509a9da22e8939fedcafafb48d238e698ea9739868b3e3e4e0cc317db3f55ee1193eb9c17fd0b407724e1c8df7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-capt-of.sty \
texlive-capt-of"

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
