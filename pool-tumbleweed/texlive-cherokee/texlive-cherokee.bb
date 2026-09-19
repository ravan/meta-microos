SUMMARY = "A font for the Cherokee script"
DESCRIPTION = "The Cherokee script was designed in 1821 by Segwoya. The \
alphabet is essentially syllabic, only 6 characters (a e i o s \
u) correspond to Roman letters: the font encodes these to the \
corresponding roman letter. The remaining 79 characters have \
been arbitrarily encoded in the range 38-122; the cherokee \
package provides commands that map each such syllable to the \
appropriate character; for example, Segwoya himself would be \
represented \\Cse\\Cgwo\\Cya. The font is distributed as Metafont \
source; it works very poorly in modern environments, and could \
do with expert attention (if you are interested, please contact \
the CTAN team for details)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21046"

RPM_NAME = "texlive-cherokee-2026.226.svn21046-60.2.noarch.rpm"
RPM_HASH = "ca03c2a4f1d00f1095b986e0bb7b4eb02236ee616dc5d851325b1f010ee69387f7cb914c838e0a8682d173692173dfef9c90be1c2abb54e3d87a99559f7adc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cherokee.sty \
tex-cherokee.tfm \
texlive-cherokee"

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
