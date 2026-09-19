SUMMARY = "Fonts and LaTeX support files for Arev Sans"
DESCRIPTION = "The package arev provides type 1 and virtual fonts, together \
with LaTeX packages for using Arev Sans in both text and \
mathematics. Arev Sans is a derivative of Bitstream Vera Sans \
created by Tavmjong Bah, adding support for Greek and Cyrillic \
characters. Bah also added a few variant letters that are more \
appropriate for mathematics. The primary purpose for using Arev \
Sans in LaTeX is presentations, particularly when using a \
computer projector. In such a context, Arev Sans is quite \
readable, with large x-height, 'open letters', wide spacing, \
and thick stems. The style is very similar to the SliTeX font \
lcmss, but heavier. Arev is one of a very small number of \
sans-font mathematics support packages. Others are cmbright, \
hvmath and kerkis."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-arev-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "b16e8dd9f9430c1d4a3d8be7343fea247fce352c40e5653eb06bb54fda17110f84846cd4d6f085681d84cfb84b2fdc59fcd33c79d99ae113b82d2161a36e7181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ArevSans-Bold.tfm \
tex-ArevSans-BoldOblique.tfm \
tex-ArevSans-Oblique.tfm \
tex-ArevSans-Roman.tfm \
tex-ams-mdbch.sty \
tex-arev.map \
tex-arev.sty \
tex-arevmath.sty \
tex-arevoml.enc \
tex-arevoms.enc \
tex-arevot1.enc \
tex-arevsymbols.tex \
tex-arevtext.sty \
tex-favb8r.tfm \
tex-favb8t.tfm \
tex-favb8t.vf \
tex-favbi8r.tfm \
tex-favbi8t.tfm \
tex-favbi8t.vf \
tex-favmb7t.tfm \
tex-favmbi7m.tfm \
tex-favmr7t.tfm \
tex-favmr7y.tfm \
tex-favmri7m.tfm \
tex-favr8r.tfm \
tex-favr8t.tfm \
tex-favr8t.vf \
tex-favri8r.tfm \
tex-favri8t.tfm \
tex-favri8t.vf \
tex-omlzavm.fd \
tex-omszavm.fd \
tex-ot1zavm.fd \
tex-t1fav.fd \
tex-uzavm.fd \
tex-zavmb7t.tfm \
tex-zavmb7t.vf \
tex-zavmbi7m.tfm \
tex-zavmbi7m.vf \
tex-zavmr7t.tfm \
tex-zavmr7t.vf \
tex-zavmr7y.tfm \
tex-zavmr7y.vf \
tex-zavmri7m.tfm \
tex-zavmri7m.vf \
texlive-arev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-beramono.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-md-chb7m.tfm \
tex-md-chb7t.tfm \
tex-md-chb7y.tfm \
tex-mdacmr.fd \
tex-textcomp.sty \
tex-updmap.cfg \
texlive \
texlive-arev-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
