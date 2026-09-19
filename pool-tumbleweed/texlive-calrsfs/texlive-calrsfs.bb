SUMMARY = "Copperplate calligraphic letters in LaTeX"
DESCRIPTION = "Provides a maths interface to the rsfs fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-calrsfs-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "a6d0f83fa48c6b44e9410018fff2aca869cb582eead4814adfd08ad097ac0df4bc539e0672e81c58942d494e4839a8830eeb9e5be3ead59b4f6d22a0a9e683ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OMSrsfs.fd \
tex-calrsfs.sty \
texlive-calrsfs"

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
