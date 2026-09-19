SUMMARY = "Simple Icons for LaTeX"
DESCRIPTION = "Similar to FontAwesome icons being provided on LaTeX by the \
fontawesome package, this package aims to do the same with \
Simple Icons. For reference, visit their website: \
https://simpleicons.org/."
LICENSE = "LPPL-1.0"

PV = "2026.226.16.9.0svn78009"

RPM_NAME = "texlive-simpleicons-2026.226.16.9.0svn78009-60.2.noarch.rpm"
RPM_HASH = "dcacd15ba24e169e9835c0b785f1d1a5f4f5b6cfedcd0dbb8f08b82eae730b01746b66400bf7ad7e5c5f419feea1fe75d7eed75bf803f52cae8182163ba442a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SimpleIcons--simpleiconseight.tfm \
tex-SimpleIcons--simpleiconsfive.tfm \
tex-SimpleIcons--simpleiconsfour.tfm \
tex-SimpleIcons--simpleiconsnine.tfm \
tex-SimpleIcons--simpleiconsone.tfm \
tex-SimpleIcons--simpleiconsonefour.tfm \
tex-SimpleIcons--simpleiconsoneone.tfm \
tex-SimpleIcons--simpleiconsonethree.tfm \
tex-SimpleIcons--simpleiconsonetwo.tfm \
tex-SimpleIcons--simpleiconsonezero.tfm \
tex-SimpleIcons--simpleiconsseven.tfm \
tex-SimpleIcons--simpleiconssix.tfm \
tex-SimpleIcons--simpleiconsthree.tfm \
tex-SimpleIcons--simpleiconstwo.tfm \
tex-simpleicons.map \
tex-simpleicons.sty \
tex-simpleiconseight.enc \
tex-simpleiconsfive.enc \
tex-simpleiconsfour.enc \
tex-simpleiconsglyphs-pdftex.tex \
tex-simpleiconsglyphs-xeluatex.tex \
tex-simpleiconsnine.enc \
tex-simpleiconsone.enc \
tex-simpleiconsonefour.enc \
tex-simpleiconsoneone.enc \
tex-simpleiconsonethree.enc \
tex-simpleiconsonetwo.enc \
tex-simpleiconsonezero.enc \
tex-simpleiconsseven.enc \
tex-simpleiconssix.enc \
tex-simpleiconsthree.enc \
tex-simpleiconstwo.enc \
tex-usimpleiconseight.fd \
tex-usimpleiconsfive.fd \
tex-usimpleiconsfour.fd \
tex-usimpleiconsnine.fd \
tex-usimpleiconsone.fd \
tex-usimpleiconsonefour.fd \
tex-usimpleiconsoneone.fd \
tex-usimpleiconsonethree.fd \
tex-usimpleiconsonetwo.fd \
tex-usimpleiconsonezero.fd \
tex-usimpleiconsseven.fd \
tex-usimpleiconssix.fd \
tex-usimpleiconsthree.fd \
tex-usimpleiconstwo.fd \
texlive-simpleicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-simpleicons-fonts"

inherit rpm
