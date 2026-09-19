SUMMARY = "Support package for XML/SGML typesetting"
DESCRIPTION = "Packages providing XML parsing, UTF-8 parsing, Unicode \
entities, and common formatting object definitions for jadetex."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn69742"

RPM_NAME = "texlive-passivetex-2026.226.svn69742-58.2.noarch.rpm"
RPM_HASH = "609fcfee7259b30b9bf11eff18f183adcfbeebea00648669da6a800985a2cb1b14c9dee91f20e50a7d22dde5a01745dcbe6b9020cefdf244b0eecbe0f014e5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dummyels.sty \
tex-fotex.sty \
tex-mlnames.sty \
tex-teixml.sty \
tex-teixmlslides.sty \
tex-ucharacters.sty \
tex-unicode.sty \
texlive-passivetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-bm.sty \
tex-color.sty \
tex-eucal.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-marvosym.sty \
tex-multicol.sty \
tex-nameref.sty \
tex-pifont.sty \
tex-rotating.sty \
tex-stmaryrd.sty \
tex-textcomp.sty \
tex-times.sty \
tex-tipa.sty \
tex-tone.sty \
tex-ulem.sty \
tex-url.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
