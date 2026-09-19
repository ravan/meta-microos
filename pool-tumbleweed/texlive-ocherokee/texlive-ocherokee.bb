SUMMARY = "LaTeX Support for the Cherokee language"
DESCRIPTION = "Macros and Type 1 fonts for Typesetting the Cherokee language \
with the Omega version of LaTeX (known as Lambda)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25689"

RPM_NAME = "texlive-ocherokee-2026.226.svn25689-61.2.noarch.rpm"
RPM_HASH = "d064bfa912d5b550927f5ad0e318e12d024e06d676bc17dee7646af69d1550779d8655767650705163e3da9e4d5716a8e040d41637dcb9c5651b09e4237080f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Cherokee.tfm \
tex-Cherokeeb.tfm \
tex-Cherokeebo.tfm \
tex-Cherokeeo.tfm \
tex-cherokee.map \
tex-lchcmr.fd \
tex-lchenc.def \
tex-ocherokee.sty \
texlive-ocherokee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ocherokee-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
