SUMMARY = "Experimental unicode bidi package for XeTeX"
DESCRIPTION = "The experimental unicode-bidi package allows to mix non-RTL \
script with RTL script without any markup."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-unicode-bidi-2026.226.0.0.01svn77682-60.2.noarch.rpm"
RPM_HASH = "5f180bbe2052f2b8c94225ed5341dfececda23b4f8d16e38d31f0f19d537ba396db57b216473e47fe8a9ca7a60343eb49edddd5cd9a77826791f87895edfd02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-bidi.sty \
texlive-unicode-bidi"

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
