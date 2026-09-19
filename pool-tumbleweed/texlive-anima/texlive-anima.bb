SUMMARY = "Create slideshows with simple animations"
DESCRIPTION = "The idea for this package arose from noticing that including \
the \\pause command from the beamer class within the \\foreach \
loop command from the TikZ package creates a sequence of \
frames, where each slide presents a step in the construction of \
the image. The purpose of the anima class is to provide macros \
that simplify the use of this effect for creating animated \
slide presentations. Although the functionality of this class \
can be compared to the transition effects of the beamer class, \
it is not a dependency of the anima class. However, the class \
makes extensive use of the image creation language provided by \
the TikZ package. Lastly, it is worth noting a comparison \
between this class and the animate package. The animate package \
can create embedded animations within the document, while the \
anima class produces an animation where each frame corresponds \
to a page of the document. This distinction highlights the \
different design goals of the anima class."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn73126"

RPM_NAME = "texlive-anima-2026.226.1.1svn73126-61.2.noarch.rpm"
RPM_HASH = "3a971f94690133a0b4fbb42cf31802b3b528f30daa30f49f4e33e5472283a3c4873cfd3c4b0d0e393044c2da45d50f76eb9f72a813a210c4f32e961c582a080b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-anima.cls \
texlive-anima"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-standalone.cls \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
