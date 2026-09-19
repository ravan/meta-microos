SUMMARY = "Embed images as base64-encoded strings"
DESCRIPTION = "This package allows to embed images directly as base64-encoded \
strings into an LuaLaTeX document. This can be useful, e. g. to \
package a document with images into a single TeX file, or with \
automatically generated graphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn50788"

RPM_NAME = "texlive-luaimageembed-2026.226.0.0.1svn50788-59.2.noarch.rpm"
RPM_HASH = "de5e1097bf7209ce99c91cf82246aa52e5a7164153af82d8f7691bb902563cda9998e996294c80c9b846aea5d65f22cc1cf685e18aee22682780ccd79222e9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaimageembed.sty \
texlive-luaimageembed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
