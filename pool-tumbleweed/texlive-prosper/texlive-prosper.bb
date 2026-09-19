SUMMARY = "LaTeX class for high quality slides"
DESCRIPTION = "Prosper is a LaTeX class for writing transparencies. It is \
written as an extension of the seminar class by Timothy Van \
Zandt. Prosper offers a friendly environment for creating \
slides for both presentations with an overhead projector and a \
video projector. Slides prepared for a presentation with a \
computer and a video projector may integrate animation effects, \
incremental display, and so on. Various visual styles are \
supported (including some that mimic PowerPoint) and others are \
being contributed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0hsvn77682"

RPM_NAME = "texlive-prosper-2026.226.1.0hsvn77682-59.2.noarch.rpm"
RPM_HASH = "565faf56bac3d1e3cdf336f8e4135719330159b12046a572517c82a0ad09e883395ba6156a5bf116094653b63c9573b3c8f568c78adb1e4864ac5dce9fe8bf00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PPRalcatel.sty \
tex-PPRalienglow.sty \
tex-PPRautumn.sty \
tex-PPRazure.sty \
tex-PPRblends.sty \
tex-PPRcapsules.sty \
tex-PPRcontemporain.sty \
tex-PPRcorners.sty \
tex-PPRdarkblue.sty \
tex-PPRdefault.sty \
tex-PPRframes.sty \
tex-PPRfyma.sty \
tex-PPRgyom.sty \
tex-PPRlignesbleues.sty \
tex-PPRmancini.sty \
tex-PPRnuancegris.sty \
tex-PPRprettybox.sty \
tex-PPRrico.sty \
tex-PPRserpaggi.sty \
tex-PPRthomasd.sty \
tex-PPRtroispoints.sty \
tex-PPRwhitecross.sty \
tex-PPRwinter.sty \
tex-PPRwj.sty \
tex-prosper.cls \
texlive-prosper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-fp.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-mathpazo.sty \
tex-multido.sty \
tex-palatino.sty \
tex-pst-grad.sty \
tex-pst-slpe.sty \
tex-semhelv.sty \
tex-seminar.cls \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
