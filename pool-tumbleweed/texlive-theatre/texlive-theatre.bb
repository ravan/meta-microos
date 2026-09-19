SUMMARY = "A sophisticated package for typesetting stage plays"
DESCRIPTION = "This package enables the user to typeset stage plays in a way \
that permits to create highly customized printouts for each \
actor."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn45363"

RPM_NAME = "texlive-theatre-2026.227.0.0.1svn45363-62.2.noarch.rpm"
RPM_HASH = "039520150b11c00361f80ad9cd3e0e4ee185e6b94cab77c9b2d48ee045b9dbabee114e650a35bf5def371caf908a6a6dde397c6ba8e76a64830fd2e65b3dbe6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theatre"

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
