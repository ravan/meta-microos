SUMMARY = "Libris ADF fonts, with LaTeX support"
DESCRIPTION = "LibrisADF is a sans-serif family designed to mimic Lydian. The \
bundle includes: fonts, in Adobe Type 1, TrueType and OpenType \
formats, and LaTeX support macros, for use with the Type 1 \
versions of the fonts. The LaTeX macros depend on the \
nfssext-cfr bundle. GPL licensing applies the fonts themselves; \
the support macros are distributed under LPPL licensing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-libris-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "14f84eb06287ea4b4d7e363452f8978d06719bd015133658d9a03c0779a33fcef57c855e0888714c0ee3a6fe737d1e2044431f40d60825659f0de2f0422abd7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libris-supp.enc \
tex-libris.sty \
tex-t1-cfr-yly.enc \
tex-t1yly.fd \
tex-t1ylyw.fd \
tex-ts1-euro-yly.enc \
tex-ts1yly.fd \
tex-ts1ylyw.fd \
tex-yly.map \
tex-ylyb-t1.tfm \
tex-ylyb-ts1.tfm \
tex-ylyb8c.tfm \
tex-ylyb8c.vf \
tex-ylyb8s.tfm \
tex-ylyb8t.tfm \
tex-ylyb8t.vf \
tex-ylybi-t1.tfm \
tex-ylybi-ts1.tfm \
tex-ylybi8c.tfm \
tex-ylybi8c.vf \
tex-ylybi8s.tfm \
tex-ylybi8t.tfm \
tex-ylybi8t.vf \
tex-ylybiw8t.tfm \
tex-ylybiw8t.vf \
tex-ylybw8t.tfm \
tex-ylybw8t.vf \
tex-ylyr-t1.tfm \
tex-ylyr-ts1.tfm \
tex-ylyr8c.tfm \
tex-ylyr8c.vf \
tex-ylyr8s.tfm \
tex-ylyr8t.tfm \
tex-ylyr8t.vf \
tex-ylyri-t1.tfm \
tex-ylyri-ts1.tfm \
tex-ylyri8c.tfm \
tex-ylyri8c.vf \
tex-ylyri8s.tfm \
tex-ylyri8t.tfm \
tex-ylyri8t.vf \
tex-ylyriw8t.tfm \
tex-ylyriw8t.vf \
tex-ylyrw8t.tfm \
tex-ylyrw8t.vf \
texlive-libris"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-nfssext-cfr.sty \
tex-svn-prov.sty \
tex-textcomp.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-libris-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
