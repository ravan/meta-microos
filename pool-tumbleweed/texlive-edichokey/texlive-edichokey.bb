SUMMARY = "Typeset dichotomous identification keys"
DESCRIPTION = "This is a LaTeX package for typesetting dichotomous \
identification key in indented style. It can be considered as \
an extended version of package dichokey, as edichokey is more \
capable of dealing with complex keys."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-2026.226.2.01ysvn56223-61.4.noarch.rpm"
RPM_HASH = "3d828c3e28c8c0a5311b389943a9d960e9d6078476977949949e73149472448610f8336bc532865cedc2e1e61463b61fca1da8ec87c67d52ba47c2876462f14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edichokey.sty \
texlive-edichokey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
