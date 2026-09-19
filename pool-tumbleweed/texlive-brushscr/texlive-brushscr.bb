SUMMARY = "A handwriting script font"
DESCRIPTION = "The BrushScript font simulates hand-written characters; it is \
distributed in Adobe Type 1 format (but is available in italic \
shape only). The package includes the files needed by LaTeX in \
order to use that font. The file AAA_readme.tex fully describes \
the package and sample.tex illustrates its use."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28363"

RPM_NAME = "texlive-brushscr-2026.226.svn28363-59.2.noarch.rpm"
RPM_HASH = "c735481d06c6ce4edfa18d9dd8398bd7b247d5add97a00a91dbdf5b9ba2423c0e9598b03b85fc4d57fe2e3228c068dd0f6e5e8e346c16cf3594d6608e7f3319c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbsi.map \
tex-pbsi.sty \
tex-pbsi.tfm \
tex-pbsi8r.tfm \
tex-pbsi8t.tfm \
tex-pbsi8t.vf \
tex-t1pbsi.fd \
texlive-brushscr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-brushscr-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
