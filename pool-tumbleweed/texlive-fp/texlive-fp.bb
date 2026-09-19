SUMMARY = "Fixed point arithmetic"
DESCRIPTION = "An extensive collection of arithmetic operations for fixed \
point real numbers of high precision."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1dsvn77682"

RPM_NAME = "texlive-fp-2026.226.2.1dsvn77682-60.2.noarch.rpm"
RPM_HASH = "199da3aa1c55eb669ceb323092950bcfa194514ec68e16e012666663d54dd6c6b42170ae71a51656f2db70a3e175b6a83959e4dc3d0a5ca30679d3d08f12039b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-defpattern.sty \
tex-fp-addons.sty \
tex-fp-basic.sty \
tex-fp-eqn.sty \
tex-fp-eval.sty \
tex-fp-exp.sty \
tex-fp-pas.sty \
tex-fp-random.sty \
tex-fp-snap.sty \
tex-fp-trigo.sty \
tex-fp-upn.sty \
tex-fp.sty \
tex-fp.tex \
tex-lfp.sty \
texlive-fp"

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
