SUMMARY = "Patches and improvements for prosper"
DESCRIPTION = "HA-prosper is a patch for prosper that adds new functionality \
to prosper based presentations. Among the new features you will \
find automatic generation of a table of contents on each slide, \
support for notes and portrait slides. The available styles \
demonstrate how to expand the functionality of prosper even \
further."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-2026.226.4.21svn59651-60.4.noarch.rpm"
RPM_HASH = "2e312c7abb7538b9a756e33517373af36a60c704683ceba98445928aa669333115e959a2d18076db864a565d5c748aedfdbafa252db3ae1d8264fa5dd1cab89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-HA-prosper.cfg \
tex-HA-prosper.sty \
tex-HAPAggie.sty \
tex-HAPFyma.sty \
tex-HAPHA.sty \
tex-HAPLakar.sty \
tex-HAPTCS.sty \
tex-HAPTCSTealBlue.sty \
tex-HAPTCSgrad.sty \
tex-HAPTycja.sty \
tex-HAPcapsules.sty \
tex-HAPciment.sty \
tex-HAPsimple.sty \
texlive-ha-prosper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-mathpazo.sty \
tex-multido.sty \
tex-palatino.sty \
tex-pifont.sty \
tex-pst-grad.sty \
tex-pst-slpe.sty \
tex-semhelv.sty \
tex-verbatim.sty \
tex-xcomment.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
