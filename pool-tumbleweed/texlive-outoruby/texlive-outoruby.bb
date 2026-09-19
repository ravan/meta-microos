SUMMARY = "Ruby with line break support for Japanese text"
DESCRIPTION = "This package provides the \\outoruby command, which supports \
line breaks when typesetting ruby anotations. It automatically \
switches between appropriate ruby forms at the beginning and \
the end of lines according to JIS X 4051 and JLReq. This \
package depends on pxrubrica and supports any engine that is \
supported by that package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.0.1svn74638"

RPM_NAME = "texlive-outoruby-2026.226.0.0.0.1svn74638-61.2.noarch.rpm"
RPM_HASH = "156bafb9603c888495efe6c03d79c8f99c05bc2913d861c167c15c1b7fcadaf64bf42692deec0ccc6db0bcd8d2788c8f2f6b01530f34a72f726fb84726baa2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outoruby.sty \
texlive-outoruby"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
tex-pxrubrica.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pxrubrica \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
