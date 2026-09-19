SUMMARY = "LaTeX for Omega and Aleph"
DESCRIPTION = "The lambda package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45756"

RPM_NAME = "texlive-lambda-2026.226.svn45756-63.2.noarch.rpm"
RPM_HASH = "f8b9d391a12087cff3ddb31e220b574c2800cc4aac8c8152492bef2e0a132d7edefdd951e85c92a7b4a2c0dd7c9b99160689b7595fb496bac9fe94666b1291ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-lambda \
tex-UT1cmr.fd \
tex-UT1omlgc.fd \
tex-elhyph16.tex \
tex-grcodes.tex \
tex-grmhyph.tex \
tex-lambda.tex \
tex-language.dat \
tex-lchcmr.fd \
tex-lchenc.def \
tex-ocherokee.sty \
tex-odev.sty \
tex-ojapan.sty \
tex-omarab.cfg \
tex-omega.sty \
tex-omlgc.cfg \
tex-ot1omarb.fd \
tex-ot1omlgc.fd \
tex-ot1uctt.fd \
tex-ut1enc.def \
texlive-lambda"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-grlccode.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
