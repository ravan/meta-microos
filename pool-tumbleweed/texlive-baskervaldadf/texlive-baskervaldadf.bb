SUMMARY = "Baskervald ADF fonts collection with TeX/LaTeX support"
DESCRIPTION = "Baskervald ADF is a serif family with lining figures designed \
as a substitute for Baskerville. The family currently includes \
upright and italic or oblique shapes in each of regular, bold \
and heavy weights. All fonts include the slashed zero and \
additional non-standard ligatures. The support package renames \
them according to the Karl Berry fontname scheme and defines \
two families. One of these primarily provides access to the \
'standard' or default characters while the other supports \
additional ligatures. The included package files provide access \
to these features in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-baskervaldadf-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "93ae99bc381708d2dbe45c02aa1833b2f5ab005057333775b43012db0e227a67ab58e394985ea7a9ec0f284de27397783e79d19b138b89f6e2a64044c074beaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-baskervald.sty \
tex-supp-ybv.enc \
tex-t1ybv.fd \
tex-t1ybvw.fd \
tex-ts1ybv.fd \
tex-ts1ybvw.fd \
tex-ybv.map \
tex-ybvb8c.tfm \
tex-ybvb8c.vf \
tex-ybvb8r.tfm \
tex-ybvb8s.tfm \
tex-ybvb8sr.tfm \
tex-ybvb8t.tfm \
tex-ybvb8t.vf \
tex-ybvbi8c.tfm \
tex-ybvbi8c.vf \
tex-ybvbi8r.tfm \
tex-ybvbi8s.tfm \
tex-ybvbi8sr.tfm \
tex-ybvbi8t.tfm \
tex-ybvbi8t.vf \
tex-ybvbiw8t.tfm \
tex-ybvbiw8t.vf \
tex-ybvbw8t.tfm \
tex-ybvbw8t.vf \
tex-ybvh8c.tfm \
tex-ybvh8c.vf \
tex-ybvh8r.tfm \
tex-ybvh8s.tfm \
tex-ybvh8sr.tfm \
tex-ybvh8t.tfm \
tex-ybvh8t.vf \
tex-ybvho8c.tfm \
tex-ybvho8c.vf \
tex-ybvho8r.tfm \
tex-ybvho8s.tfm \
tex-ybvho8sr.tfm \
tex-ybvho8t.tfm \
tex-ybvho8t.vf \
tex-ybvhow8t.tfm \
tex-ybvhow8t.vf \
tex-ybvhw8t.tfm \
tex-ybvhw8t.vf \
tex-ybvr8c.tfm \
tex-ybvr8c.vf \
tex-ybvr8r.tfm \
tex-ybvr8s.tfm \
tex-ybvr8sr.tfm \
tex-ybvr8t.tfm \
tex-ybvr8t.vf \
tex-ybvri8c.tfm \
tex-ybvri8c.vf \
tex-ybvri8r.tfm \
tex-ybvri8s.tfm \
tex-ybvri8sr.tfm \
tex-ybvri8t.tfm \
tex-ybvri8t.vf \
tex-ybvriw8t.tfm \
tex-ybvriw8t.vf \
tex-ybvrw8t.tfm \
tex-ybvrw8t.vf \
texlive-baskervaldadf"

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
texlive-baskervaldadf-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
