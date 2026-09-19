SUMMARY = "Simple typesetting system for mixed Arabic/Latin documents"
DESCRIPTION = "This package allows simple typesetting in Arabic script, \
intended for mixed Arabic/Latin script usage in situations \
where heavy-duty solutions are discouraged. The system operates \
with both Unicode and transliterated input, allowing the user \
to choose the most appropriate approach for every situation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn54191"

RPM_NAME = "texlive-dad-2026.226.1.2svn54191-61.2.noarch.rpm"
RPM_HASH = "448f4c002f9c5563cfd5d6824ddba25c0cbaf7b013805005fe7b303ee237fa73fa6690d788e37b79d3ab65be08276c909dbc7aea616703e054ac60b70a239032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OT1dad.fd \
tex-T1dad.fd \
tex-dad.map \
tex-dad.sty \
tex-dadreal.tfm \
tex-dadrealbold.tfm \
tex-dadrealmono.tfm \
texlive-dad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatex85.sty \
tex-updmap.cfg \
texlive \
texlive-dad-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
