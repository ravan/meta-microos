SUMMARY = "Macros for typesetting circuit diagrams"
DESCRIPTION = "Several electrical symbols like resistor, capacitor, \
transistors etc., are defined. The symbols can be connected \
with wires. The package also contains an American resistor \
symbol for those of us on that side of the Atlantic. The \
package also has simple facilities for producing optics \
diagrams; however, no-one would deny that the PSTricks \
pst-optic package, or the MetaPost makecirc package do the job \
better."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn62977"

RPM_NAME = "texlive-circ-2026.226.1.1svn62977-60.2.noarch.rpm"
RPM_HASH = "fed77a613fefad1d7b85d72ec873fc8ec4229681ac7aa2d5c158e2304dea7d7ca560053178dd6764fe050426c50ae78b32df27d189e4bcc6b7b8a92ff0a3fcda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basic.def \
tex-box.def \
tex-cioptic.tfm \
tex-circ.sty \
tex-gate.def \
tex-ic.def \
tex-oldgate.def \
tex-optics.def \
tex-physics.def \
texlive-circ"

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
