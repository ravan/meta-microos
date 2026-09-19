SUMMARY = "Course texts, master theses, and exams in University of Antwerp style"
DESCRIPTION = "These class files implement the house style of the University \
of Antwerp. This package originated from the Faculty of Applied \
Engineering. Using these class files will make it easy for you \
to make and keep your documents compliant to this version and \
future versions of the house style of the University of \
Antwerp."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.11svn76924"

RPM_NAME = "texlive-uantwerpendocs-2026.226.4.11svn76924-59.2.noarch.rpm"
RPM_HASH = "a6e67084defe960ede0e710b75d6b54379f90560495ec5f016237497abd2aeb5b67446fa9a41892c41bae4b9900ce323f919b055fc7bd00b139c1155bc997036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeuantwerpen.sty \
tex-beamerfontthemeuantwerpen.sty \
tex-beamerinnerthemeuantwerpen.sty \
tex-beamerouterthemeuantwerpen.sty \
tex-beamerthemeuantwerpen.sty \
tex-uantwerpenbamathesis.cls \
tex-uantwerpencolorlogoscheme.sty \
tex-uantwerpencommonoptions.clo \
tex-uantwerpencoursetext.cls \
tex-uantwerpenexam.cls \
tex-uantwerpenletter.cfg \
tex-uantwerpenletter.cls \
tex-uantwerpenphdthesis.cls \
tex-uantwerpenreport.cls \
texlive-uantwerpendocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-background.sty \
tex-bm.sty \
tex-cmbright.sty \
tex-color.sty \
tex-crop.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphbox.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-sansmathaccent.sty \
tex-shellesc.sty \
tex-soul.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
