SUMMARY = "Compute Modern-like font with long s"
DESCRIPTION = "Metafont sources modified from Computer Modern in order to \
generate 'long s' which was used in old text."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn17932"

RPM_NAME = "texlive-oldlatin-2026.226.1.00svn17932-61.2.noarch.rpm"
RPM_HASH = "c9b5e5906182fd3324c4a8345b1c66c82a117d2dc5e3752c25736ac8acc6b0f541d2b858e6f08fbd620dcd02d6c42b6a30fd56a57ad674916e112fb631790000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-olb10.tfm \
tex-olbx10.tfm \
tex-olbx12.tfm \
tex-olbx5.tfm \
tex-olbx6.tfm \
tex-olbx7.tfm \
tex-olbx8.tfm \
tex-olbx9.tfm \
tex-olbxsl10.tfm \
tex-oldunh10.tfm \
tex-olff10.tfm \
tex-olfib8.tfm \
tex-olr10.tfm \
tex-olr12.tfm \
tex-olr17.tfm \
tex-olr5.tfm \
tex-olr6.tfm \
tex-olr7.tfm \
tex-olr8.tfm \
tex-olr9.tfm \
tex-olsl10.tfm \
tex-olsl12.tfm \
tex-olsl8.tfm \
tex-olsl9.tfm \
tex-olsltt10.tfm \
tex-olss10.tfm \
tex-olss12.tfm \
tex-olss17.tfm \
tex-olss8.tfm \
tex-olss9.tfm \
tex-olssbx10.tfm \
tex-olssdc10.tfm \
tex-olssi10.tfm \
tex-olssi12.tfm \
tex-olssi17.tfm \
tex-olssi8.tfm \
tex-olssi9.tfm \
tex-olssq8.tfm \
tex-olssqi8.tfm \
tex-oltt10.tfm \
tex-oltt12.tfm \
tex-oltt8.tfm \
tex-oltt9.tfm \
tex-olvtt10.tfm \
texlive-oldlatin"

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
