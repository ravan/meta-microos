SUMMARY = "OrnementsADF font with TeX/LaTeX support"
DESCRIPTION = "The bundle provides the Ornements ADF font in PostScript type 1 \
format with TeX/LaTeX support files. The font is licensed under \
GPL v2 or later with font exception. (See NOTICE, COPYING, \
README.) The TeX/LaTeX support is licensed under LPPL. (See \
README, manifest.txt.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn78142"

RPM_NAME = "texlive-adforn-2026.226.1.4svn78142-61.2.noarch.rpm"
RPM_HASH = "3e8e9f2182dedb5ab932aab6df5747f496d495e32ab51375435656677bc1f18d90880a15b23adff63a77e161a731b328b61a1190c9a6c88c2f9a8998d65bd088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OrnementsADF.enc \
tex-OrnementsADF.tfm \
tex-adforn.map \
tex-adforn.sty \
tex-uornementsadf.fd \
texlive-adforn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fixtounicode.sty \
tex-l3keys2e.sty \
tex-svn-prov.sty \
tex-updmap.cfg \
texlive \
texlive-adforn-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
