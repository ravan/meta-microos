SUMMARY = "Extension of \\fbox, with controllable frames and colours"
DESCRIPTION = "The package defines the \\efbox command, which creates a box \
just wide enough to hold the text created by its argument. The \
command optionally puts a (possibly partial) frame around the \
box, and allows setting the box background colour."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-efbox-2026.226.1.0svn77682-61.4.noarch.rpm"
RPM_HASH = "49c1a4f05cf307a7be7e618da77e632357cf466503b623e99aa3e8e37e6a20270ec1af865ccc0688c17fd65000baee5d852dc18229fc249933133169a9ef1bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-efbox.sty \
texlive-efbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
