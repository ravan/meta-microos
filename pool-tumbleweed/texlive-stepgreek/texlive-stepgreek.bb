SUMMARY = "A free Times/Elsevier-style Greek font"
DESCRIPTION = "This is a beta version of the STEP Greek font. Only a regular \
face is available at present, though there are plans to add \
italic, bold and bold italic in the future. The font only \
supports LGR in TeX and is meant to serve as a Greek complement \
to a Times-like font such as STEP. The font supports polytonic \
Greek."
LICENSE = "OFL-1.1"

PV = "2026.226.3.0b1svn57074"

RPM_NAME = "texlive-stepgreek-2026.226.3.0b1svn57074-64.2.noarch.rpm"
RPM_HASH = "d763192e272269812ee4973d60b821aae3316c4a39d8925d4115c32cfe38fe8b4343b5a7b28a04cf21aba02242e9045938b786fabbc3aefa7bafcccfd9b5ad54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGRSTEPGreekTest-Sup.fd \
tex-LGRSTEPGreekTest-TLF.fd \
tex-LGRSTEPGreekTest-TOsF.fd \
tex-STEPGreekTest-Regular-sup-lgr--base.tfm \
tex-STEPGreekTest-Regular-sup-lgr.tfm \
tex-STEPGreekTest-Regular-sup-lgr.vf \
tex-STEPGreekTest-Regular-tlf-lgr--base.tfm \
tex-STEPGreekTest-Regular-tlf-lgr.tfm \
tex-STEPGreekTest-Regular-tlf-lgr.vf \
tex-STEPGreekTest-Regular-tlf-sc-lgr--base.tfm \
tex-STEPGreekTest-Regular-tlf-sc-lgr.tfm \
tex-STEPGreekTest-Regular-tlf-sc-lgr.vf \
tex-STEPGreekTest-Regular-tosf-lgr--base.tfm \
tex-STEPGreekTest-Regular-tosf-lgr.tfm \
tex-STEPGreekTest-Regular-tosf-lgr.vf \
tex-STEPGreekTest-Regular-tosf-sc-lgr--base.tfm \
tex-STEPGreekTest-Regular-tosf-sc-lgr.tfm \
tex-STEPGreekTest-Regular-tosf-sc-lgr.vf \
tex-STEPGreekTest.map \
tex-a-ewwrtj.enc \
tex-a-ntxmjl.enc \
tex-a-uo326q.enc \
tex-a-voidup.enc \
tex-a-wkkjyg.enc \
texlive-stepgreek"

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
texlive-scripts \
texlive-scripts-bin \
texlive-stepgreek-fonts"

inherit rpm
