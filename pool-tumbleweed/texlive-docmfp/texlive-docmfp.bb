SUMMARY = "Document non-LaTeX code"
DESCRIPTION = "Extends the doc package to cater for documenting non-LaTeX \
code, such as Metafont or MetaPost, or other programming \
languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn15878"

RPM_NAME = "texlive-docmfp-2026.226.1.2dsvn15878-59.2.noarch.rpm"
RPM_HASH = "0fd5b98ccf86b6ee58b930624e8097cbb2062abf53e213c36fac61e06a41a6f25521a4ba0916e1a7a2099a12dcbaba8824f5e2c33815b9fe7d2b07edac1ea32c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docmfp.sty \
texlive-docmfp"

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
