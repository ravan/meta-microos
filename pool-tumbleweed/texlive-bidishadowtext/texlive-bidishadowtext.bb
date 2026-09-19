SUMMARY = "Bidi-aware shadow text"
DESCRIPTION = "This package allows you to typeset bidi-aware shadow text. It \
is a re-implementation of the shadowtext package adding bidi \
support."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-bidishadowtext-2026.226.0.0.1svn77682-61.2.noarch.rpm"
RPM_HASH = "72a4f54fa89e8f1ed807436ae9b16bad8f6ff21c62a281a90bec4d5642a3a329da8fb6256897851da860a58125cf4691641f80544cfb63d39c90a1d8af512306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidishadowtext.sty \
texlive-bidishadowtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
