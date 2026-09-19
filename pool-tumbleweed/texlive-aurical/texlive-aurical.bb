SUMMARY = "Calligraphic fonts for use with LaTeX in T1 encoding"
DESCRIPTION = "The package that implements a set (AuriocusKalligraphicus) of \
three calligraphic fonts derived from the author's handwriting \
in Adobe Type 1 Format, T1 encoding for use with LaTeX: \
Auriocus Kalligraphicus; Lukas Svatba; and Jana Skrivana. Each \
font features oldstyle digits and (machine-generated) boldface \
and slanted versions. A variant of Lukas Svatba offers a 'long \
s'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-aurical-2026.226.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "b56bf66e744b0f0cced569aca2801935cb97e030847f5d57936f0c6e3135492dc09d15ab7d3a51c31f2603cf2885ed408ae2e73f0cb530e6563f51a5af85c671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AmiciLogo.tfm \
tex-AmiciLogoBold.tfm \
tex-AmiciLogoBoldRslant.tfm \
tex-AmiciLogoBoldSlant.tfm \
tex-AmiciLogoRslant.tfm \
tex-AmiciLogoSlant.tfm \
tex-AuriocusKalligraphicus.tfm \
tex-AuriocusKalligraphicusBold.tfm \
tex-AuriocusKalligraphicusBoldRslant.tfm \
tex-AuriocusKalligraphicusBoldSlant.tfm \
tex-AuriocusKalligraphicusRslant.tfm \
tex-AuriocusKalligraphicusSlant.tfm \
tex-JanaSkrivana.tfm \
tex-JanaSkrivanaBold.tfm \
tex-JanaSkrivanaBoldRslant.tfm \
tex-JanaSkrivanaBoldSlant.tfm \
tex-JanaSkrivanaRslant.tfm \
tex-JanaSkrivanaSlant.tfm \
tex-LukasSvatba.tfm \
tex-LukasSvatbaBold.tfm \
tex-LukasSvatbaBoldRslant.tfm \
tex-LukasSvatbaBoldSlant.tfm \
tex-LukasSvatbaRslant.tfm \
tex-LukasSvatbaSlant.tfm \
tex-T1AmiciLogo.fd \
tex-T1AuriocusKalligraphicus.fd \
tex-T1JanaSkrivana.fd \
tex-T1LukasSvatba.fd \
tex-aurical.map \
tex-aurical.sty \
texlive-aurical"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-aurical-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
