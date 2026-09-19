SUMMARY = "Add emojis to citations"
DESCRIPTION = "This package adds emojis to citations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76924"

RPM_NAME = "texlive-emojicite-2026.226.0.0.3svn76924-61.4.noarch.rpm"
RPM_HASH = "af3b278c3f12a04e505a84e6ecec5323c41914681af51c64cb6b27df7fb8557cedc23e7f91392ab15e642970193eacea6c51890dcc0b63255444e58bbb427e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emojicite.sty \
texlive-emojicite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-emoji.sty \
tex-natbib.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
